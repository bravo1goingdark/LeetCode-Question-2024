public class lenlastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("   fly me to the moon   "));
    }
    public static int lengthOfLastWord(String s) {
        int res = 0;
        int index = s.length() - 1;

        // Move index to the last non-space character
        while (index >= 0 && s.charAt(index) == ' ') {
            index--;
        }

        // Count the length of the last word
        while (index >= 0 && s.charAt(index) != ' ') {
            res++;
            index--;
        }

        return res;
    }

}
