import java.util.HashMap;

public class completeDay {
    public int countCompleteDayPairs(int[] hours) {
        HashMap<Integer, Integer> remainderMap = new HashMap<>();
        int count = 0;
        
        for (int j = 0; j < hours.length; j++) {
            int remainder = hours[j] % 24;
            int needed = (24 - remainder) % 24;
            
            if (remainderMap.containsKey(needed)) {
                count += remainderMap.get(needed);
            }
            
            remainderMap.put(remainder, remainderMap.getOrDefault(remainder, 0) + 1);
        }
        
        return count;
    }
}
