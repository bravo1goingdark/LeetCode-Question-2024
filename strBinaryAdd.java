public class strBinaryAdd {
    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int first = a.length() - 1;
        int second = b.length() - 1;
    
        while (first >= 0 || second >= 0) {
            int sum = carry;
            if (first >= 0) {
                sum += a.charAt(first--) - '0';
            }
            if (second >= 0) {
                sum += b.charAt(second--) - '0';
            }
            result.insert(0, sum % 2);
            carry = sum / 2;
        }
    
        if (carry > 0) {
            result.insert(0, carry);
        }
    
        return result.toString();
    }
}
