package leetcode;

public class SameTree {
  public static void main(String[] args) {
    SameTree obj = new SameTree();
    TreeNode root1 = new TreeNode(1);
    root1.left = new TreeNode(2);
    root1.right = new TreeNode(2);
    TreeNode root2 = new TreeNode(1);
    root2.left = new TreeNode(2);
    root2.right = new TreeNode(2);
    System.out.println(obj.isSameTree(root1,root2));
  }

  public boolean isSameTree(TreeNode p, TreeNode q) {
    if (p == null && q == null) return true;
    if (p == null || q == null) return false;
    //Compare left node value with left node value of other tree recursively
    return (p.val == q.val) && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
  }
}
