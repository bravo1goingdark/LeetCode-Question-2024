import java.util.HashSet;
import java.util.Set;

public class nicesub {
    public String longestNiceSubstring(String s) {
        int n = s.length();
        String longestNice = "";

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String substring = s.substring(i, j);
                if (isNice(substring) && substring.length() > longestNice.length()) {
                    longestNice = substring;
                }
            }
        }
        
        return longestNice;
    }

    private boolean isNice(String s) {
        Set<Character> chars = new HashSet<>();
        for (char c : s.toCharArray()) {
            chars.add(c);
        }

        for (char c : chars) {
            if (Character.isLowerCase(c) && !chars.contains(Character.toUpperCase(c))) {
                return false;
            }
            if (Character.isUpperCase(c) && !chars.contains(Character.toLowerCase(c))) {
                return false;
            }
        }

        return true;
    }
}
