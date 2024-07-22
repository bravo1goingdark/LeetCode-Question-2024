import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class findLuck {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> map = getMap(arr);
        List<Integer> ans = new ArrayList<>();

        for (int num : arr) {
            if (map.get(num) == num) {
                ans.add(num);
            }
        }
        Object[] result = ans.toArray();
        Arrays.sort(result);

        return result.length == 0 ? -1 : (int) result[result.length - 1];

    }

    private Map<Integer, Integer> getMap(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return map;
    }
}
