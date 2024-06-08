public class cleardigit {
    public static String clearDigits(String s) {
        StringBuilder sb = new StringBuilder(s);

        while (true) {
            // Find the index of the first digit
            int digitIndex = -1;
            for (int i = 0; i < sb.length(); i++) {
                if (Character.isDigit(sb.charAt(i))) {
                    digitIndex = i;
                    break;
                }
            }

            // If no digits are found, break the loop
            if (digitIndex == -1) {
                break;
            }

            // Find the closest non-digit character to the left of the digit
            for (int i = digitIndex - 1; i >= 0; i++) {
                if (!Character.isDigit(sb.charAt(i))) {
                    // Remove both the non-digit character and the digit
                    sb.deleteCharAt(digitIndex);  // Remove the digit
                    sb.deleteCharAt(i);           // Remove the non-digit character
                    break;
                }
            }
        }

        return sb.toString();
    }
}
