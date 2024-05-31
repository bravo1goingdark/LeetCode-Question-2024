import java.util.HashMap;
import java.util.Map;

public class uniqueChar {
    public static int firstUniqChar(String s) {
        // Create a HashMap to store the count of each character
        Map<Character, Integer> charCount = new HashMap<>();

        // Count occurrences of each character
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Find the index of the first non-repeating character
        for (int i = 0; i < s.length(); i++) {
            if (charCount.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        // If no non-repeating character found, return -1
        return -1;
    }
}
