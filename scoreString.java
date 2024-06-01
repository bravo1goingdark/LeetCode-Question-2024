public class scoreString {
    public int scoreOfString(String s) {
        
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            result += diffAsciiValue(s.charAt(i), s.charAt(i+1));
        }
        return result;
    }

    public int diffAsciiValue(char first , char second){
        int value = ((int) first ) - ((int) second);
        return Math.abs(value);
    }
}
