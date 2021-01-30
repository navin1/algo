package leetcode;

public class BinaryTreePruning {
  public static void main(String[] args) {
    BinaryTreePruning obj = new BinaryTreePruning();
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    TreeNode res = obj.pruneTree(root);
    System.out.println(res);
  }

  public TreeNode pruneTree(TreeNode root) {
    return containsOne(root) ? root : null;
  }

  public boolean containsOne(TreeNode node) {
    if (node == null)
      return false;
    boolean a1 = containsOne(node.left);
    boolean a2 = containsOne(node.right);
    if (!a1) node.left = null;
    if (!a2) node.right = null;
    return node.val == 1 || a1 || a2;
  }
}
