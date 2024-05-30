public class rootEqulaSum {
    public boolean checkTree(TreeNode root) {
        int leftRightSum = root.left.val + root.right.val;
        if(root.val == leftRightSum){
            return true;
        }
        return false;
    }
}
