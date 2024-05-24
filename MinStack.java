import java.util.Stack;

public class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        this.stack = new Stack<>();
        this.minStack = new Stack<>();
    }
    public void push(int value){
        stack.push(value);
        if (minStack.isEmpty() || value <= minStack.peek()) {
            minStack.push(value);
        }
    }
    public void pop(){
        int val = stack.pop();
        if (val == minStack.peek()) {
            minStack.pop();
        }
    }
    public int top(){
        return stack.peek();
    }
    public int getMin(){
        return minStack.peek();
    }
}
