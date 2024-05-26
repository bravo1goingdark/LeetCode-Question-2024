public class palindromString {
    public String firstPalindrome(String[] words) {
        for (String string : words) {
            if (isStringPalindrome(string)) {
                return string;
            }
        }
        return "";
    }

    public boolean isStringPalindrome(String str) {
        int first = 0;
        int last = str.length() - 1;
        while (first < last) {
            if (str.charAt(first) != str.charAt(last)) {
                return false;
            }
            first++;
            last--;
        }
        return true;
    }
}
