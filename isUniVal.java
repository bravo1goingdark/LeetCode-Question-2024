import java.util.Stack;

public class isUniVal {
    public boolean isUnivalTree(TreeNode root) {
        boolean isUniValued = true;
        int rootValue = root.val;
        return bfsUsingStack(root, isUniValued, rootValue);
    }

    private boolean bfsUsingStack(TreeNode node, boolean arr, int value) {

        if (node == null) {
            return true;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(node);

        while (!stack.isEmpty()) {
            TreeNode popedNode = stack.pop();

            if (popedNode.val != value) {
                return false;
            }

            if (popedNode.right != null) {
                stack.push(popedNode.right);
            }

            if (popedNode.left != null) {
                stack.push(popedNode.left);
            }
        }
        return arr;
    }
}