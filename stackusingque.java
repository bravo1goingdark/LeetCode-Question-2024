import java.util.LinkedList;
import java.util.Queue;

class MyStack{
    private Queue<Integer> firstQue;
    private Queue<Integer> secondQue; 

    public MyStack() {
        this.firstQue = new LinkedList<>();
        this.secondQue = new LinkedList<>();
    }
    
    public void push(int x) {
        firstQue.add(x);
    }
    
    public int pop() {
        while (firstQue.size() > 1) {
            secondQue.add(firstQue.remove());
        }
        int topElement = firstQue.remove(); // Get the last element
        Queue<Integer> temp = firstQue;
        firstQue = secondQue;
        secondQue = temp; // Swap the queues
        return topElement;
    }
    
    public int top() {
        while (firstQue.size() > 1) {
            secondQue.add(firstQue.remove());
        }
        int topElement = firstQue.remove();
        secondQue.add(topElement); // Add the top element to secondQue
        Queue<Integer> temp = firstQue;
        firstQue = secondQue;
        secondQue = temp; // Swap the queues
        return topElement;
    }
    
    public boolean empty() {
        return firstQue.isEmpty();
    }
}
