/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
      int x=-1;
    public boolean isUnivalTree(TreeNode root) {
       if(root==null) return true;
        if(x<0) x= root.val;
        return root.val==x && isUnivalTree(root.left) && isUnivalTree(root.right);
    }
}