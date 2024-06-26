public class binarySumToLeaf {
    public int sumRootToLeaf(TreeNode root) {
        return dfs(root , 0);
    }
    
    
    private int dfs(TreeNode node , int currrentSum) {
        if(node == null){
            return 0;
        }
        
        currrentSum = (currrentSum << 1) | node.val;

        if (node.left == null && node.right == null) {
            return currrentSum;
        }
        int leftSum = dfs(node.left, currrentSum);
        int rightSum = dfs(node.right, currrentSum);

        return leftSum + rightSum;
    }
}
