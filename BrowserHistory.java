import java.util.Stack;

public class BrowserHistory {
    private Stack<String> back;
    private Stack<String> forward;

    public BrowserHistory(String homepage) {
        this.back = new Stack<>();
        this.forward = new Stack<>();
        back.push(homepage);
    }

    public void visit(String url) {
        while (!forward.isEmpty()) {
            forward.pop();
        }
        back.push(url);
    }

    public String back(int steps) {
        while (steps > 0 && back.size() > 1) {
            forward.push(back.pop());
            steps--;
        }
        return back.peek();
    }

    public String forward(int steps) {
        while (steps > 0 && !forward.isEmpty()) {
            back.push(forward.pop());
            steps--;
        }
        return back.peek();
    }
}

