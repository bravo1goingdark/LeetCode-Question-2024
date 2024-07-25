
public class CustomStack {
    private int[] stack;
    private int pos;

    public CustomStack(int maxSize) {
        this.stack = new int[maxSize];
        this.pos = -1;
    }
    
    public void push(int x) {
        if (pos + 1 == this.stack.length) {
            return;
        }

        this.stack[++pos] = x;
    }
    
    public int pop() {
        if(pos == -1){
            return - 1;
        }
        int pop = this.stack[pos];
        pos--;
        return pop;
    }
    
    public void increment(int k, int val) {
        if (k > this.stack.length) {
            for (int index = 0; index < stack.length; index++) {
                this.stack[index] = this.stack[index] + val;
            }
        }else {
            for (int index = 0; index < k; index++) {
                this.stack[index] = this.stack[index] + val;
            }
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */