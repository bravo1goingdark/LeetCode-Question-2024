// contest
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class occurenceOfanElement {
    public int[] findOccurrences(int[] nums, int[] queries, int x) {
        // Create a map to store indices of occurrences of x
        Map<Integer, List<Integer>> occurrenceMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num == x) {
                occurrenceMap.putIfAbsent(num, new ArrayList<>());
                occurrenceMap.get(num).add(i);
            }
        }

        // Initialize an array to store results for queries
        int[] answer = new int[queries.length];

        // Iterate through the queries
        for (int i = 0; i < queries.length; i++) {
            int queryIndex = queries[i];
            List<Integer> occurrences = occurrenceMap.getOrDefault(x, new ArrayList<>());
            if (queryIndex <= occurrences.size()) {
                answer[i] = occurrences.get(queryIndex - 1);
            } else {
                answer[i] = -1;
            }
        }

        return answer;
    }
}
