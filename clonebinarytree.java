public class clonebinarytree {

    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if (original == null || cloned == null)
            return null;
        
        return dfs(original, cloned, target);
    }
    
    private TreeNode dfs(TreeNode node, TreeNode clonedNode, TreeNode target) {
        if (node == null)
            return null;
        
        if (node == target)
            return clonedNode;
        
        TreeNode leftResult = dfs(node.left, clonedNode.left, target);
        if (leftResult != null)
            return leftResult;
        
        TreeNode rightResult = dfs(node.right, clonedNode.right, target);
        if (rightResult != null)
            return rightResult;
        
        return null;
    }
}

