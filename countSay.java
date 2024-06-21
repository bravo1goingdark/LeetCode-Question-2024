public class countSay {
    public static void main(String[] args) {
        System.out.println(countAndSay(4));
    }
    public static String countAndSay(int n) {
        if (n <= 0) {
            return "";
        } else if (n == 1) {
            return "1";
        }
        
        String prev = countAndSay(n - 1);
        StringBuilder result = new StringBuilder();
        int count = 1;
        
        for (int i = 0; i < prev.length(); i++) {
            // If current character is the same as next one, increase count
            if (i + 1 < prev.length() && prev.charAt(i) == prev.charAt(i + 1)) {
                count++;
            } else {
                // Append count and character to result
                result.append(count);
                result.append(prev.charAt(i));
                count = 1; // Reset count
            }
        }
        
        return result.toString();
    }
}
