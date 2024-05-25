public class Main {
    public static void main(String[] args) {
        MinStack stack = new MinStack();
        stack.push(-2);
        stack.push((0));
        stack.push(-3);
        stack.getMin();
        stack.pop();
        System.out.println(stack.top());
        System.out.println(stack.getMin());

        maxProduct pr = new maxProduct();
        System.out.println(pr.maxProduct(new int[] {1,2,3,4,5}));
        
        System.out.println();
        bitwiseXor bit = new bitwiseXor();
        System.out.println(bit.duplicateNumbersXOR(new int[]{1,2,1,3}));


    }
}
