package leetcode;

public class SearchInBinarySearchTree {
  public static void main(String[] args) {
    SearchInBinarySearchTree obj = new SearchInBinarySearchTree();
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(2);
    System.out.println(obj.searchBST(root, 2));
  }

  public TreeNode searchBST(TreeNode root, int val) {
    if(root==null || val == root.val)
      return root;
    return val < root.val ? searchBST(root.left, val) : searchBST(root.right, val);
  }
}
