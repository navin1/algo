package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class InvertBinaryTree {
  public static void main(String[] args) {
    InvertBinaryTree obj = new InvertBinaryTree();
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    obj.invertTree(root);
  }

  public ArrayList<ArrayList<Integer>> invertTree(TreeNode root) {
    ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();//final result
    if (root == null)
      return res;
    // Initialization
    Queue<TreeNode> q = new LinkedList<TreeNode>();
    q.offer(root);
    q.offer(null);
    ArrayList<Integer> curr = new ArrayList<Integer>();
    while (!q.isEmpty()) {
      TreeNode tmp = q.poll();
      if (tmp != null) {
        curr.add(tmp.val);//print
        if (tmp.left != null) {
          q.offer(tmp.left);
          System.out.print("'" + tmp.left.val + "'");
        }
        if (tmp.right != null) {
          q.offer(tmp.right);
          System.out.print("'" + tmp.right.val + "'");
        }
      } else {
        ArrayList<Integer> c_curr = new ArrayList<Integer>(curr);
        res.add(c_curr);
        curr.clear(); // Java will clear the reference, so have to new an new ArrayList.
        // completion of a level;
        if (!q.isEmpty())
          q.offer(null);
      }
    }
    System.out.println(res);
    return res;
  }
}
