import java.util.Stack;

public class removeADJDup {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("abbaca"));
    }
    public static String removeDuplicates(String s) {
        StringBuilder builder = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        
        for (char ch : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == ch) {
                stack.pop();
            }else {
                stack.push(ch);
            }
        }

        for (Character character : stack) {
            builder.append(character);
        }

        return builder.toString();
    }
}