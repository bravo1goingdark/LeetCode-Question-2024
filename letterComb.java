import java.util.ArrayList;
import java.util.List;

class letterComb {
    private static final String[] KEYPAD_MAPPING = {
        "",     // 0
        "",     // 1
        "abc",  // 2
        "def",  // 3
        "ghi",  // 4
        "jkl",  // 5
        "mno",  // 6
        "pqrs", // 7
        "tuv",  // 8
        "wxyz"  // 9
    };

    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }
        generateCombinations(result, "", digits);
        return result;
    }

    private static void generateCombinations(List<String> result, String current, String digits) {
        if (digits.length() == 0) {
            result.add(current);
            return;
        }
        
        char digit = digits.charAt(0);
        String letters = KEYPAD_MAPPING[digit - '0'];
        for (int i = 0; i < letters.length(); i++) {
            generateCombinations(result, current + letters.charAt(i), digits.substring(1));
        }
    }
}
