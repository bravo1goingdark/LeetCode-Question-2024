import java.util.Map;
import java.util.HashMap;

class diff {
    public char findTheDifference(String s, String t) {
        Map<Character, Integer> countMap = new HashMap<>();
        
        // Count frequencies of characters in string s
        for (char ch : s.toCharArray()) {
            countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
        }
        
        // Subtract frequencies of characters in string t
        for (char ch : t.toCharArray()) {
            int count = countMap.getOrDefault(ch, 0);
            if (count == 0) {
                return ch; // Found the differing character
            } else {
                countMap.put(ch, count - 1);
            }
        }
        
        return ' '; // This case should not actually happen based on problem constraints
    }
}
