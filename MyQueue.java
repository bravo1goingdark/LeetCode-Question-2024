import java.util.Stack;

class MyQueue {
    Stack<Integer> first;
    Stack<Integer> second;

    public MyQueue() {
        this.first = new Stack<>();
        this.second = new Stack<>();
    }
    
    public void push(int x) {
        first.push(x);
    }
    
    public int pop() {
        int index = 0;
        while (index < first.size()) {
            second.push(first.peek());
            index++;
        }
        return second.pop();
    }
    
    public int peek() {
        return second.peek();
    }
    
    public boolean empty() {
        return second.isEmpty();
    }
}
