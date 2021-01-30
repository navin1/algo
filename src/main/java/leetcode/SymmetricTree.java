package leetcode;

public class SymmetricTree {
  public static void main(String[] args) {
    SymmetricTree obj = new SymmetricTree();
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(2);
    System.out.println(obj.isSymmetric(root));
  }

  public boolean isSymmetric(TreeNode root) {
    return checkSym(root, root);
  }

  public boolean checkSym(TreeNode t1, TreeNode t2) {
    if (t1 == null && t2 == null) return true;
    if (t1 == null || t2 == null) return false;
    //Compare left node value with right node value of other tree recursively
    return (t1.val == t2.val) && checkSym(t1.left, t2.right) && checkSym(t1.right, t2.left);
  }
}
