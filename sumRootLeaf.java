public class sumRootLeaf {
  public static void main(String[] args) {
    TreeNode tree = new TreeNode(1);
    tree.left = new TreeNode(2);
    tree.right = new TreeNode(3);
    System.out.println(sumNumbers(tree));
    
  }

  public static int sumNumbers(TreeNode root) {
    return sumNumbersHelper(root, 0);
  }

  private static int sumNumbersHelper(TreeNode node, int currentSum) {
    if (node == null) {
      return 0;
    }

    currentSum = currentSum * 10 + node.val;

    if (node.left == null && node.right == null) {
      return currentSum;
    }

    int leftSum = sumNumbersHelper(node.left, currentSum);
    int rightSum = sumNumbersHelper(node.right, currentSum);

    return leftSum + rightSum;
  }

}

class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode() {

  }

  TreeNode(int val) {
    this.val = val;
  }

  TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }
}