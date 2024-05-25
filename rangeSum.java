import java.util.Stack;

class rangeSum {
    public int rangeSumBST(TreeNode root, int low, int high) {
        return DFS(root, low, high);
    }
    
    private int DFS(TreeNode root, int low ,int high){        
        int sum = 0;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode current = stack.pop();
            if (current.val >= low && current.val <= high) {
                sum += current.val;
            }

            if (current.right != null && current.val < high) {
                stack.push(current.right);
            }
            if (current.left != null && current.val > low) {
                stack.push(current.left);
            }
        }
        
        return sum;
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
