import java.util.Stack;

public class minString {
    public String clearStars(String s) {
        StringBuilder str = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '*' ) {
                stack.push(returnSmall(s.charAt(i), s.charAt(i+1)));
                str.append(s.charAt(i));
            }else{
                char pop = stack.pop();
                delChar(str, pop);
            }
            
        }
        return new String(str);
    }
    public char returnSmall(char first,char second){
        if (charValue(first) > charValue(second)) {
            return second;
        }
        return first;
    }
    public int charValue(char first){
        return ((int) first);
    }
    public void delChar(StringBuilder str , char value){
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == value) {
                str.deleteCharAt(i);
            }
        }
    }
}
