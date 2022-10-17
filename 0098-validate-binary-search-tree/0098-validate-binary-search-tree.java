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
    public boolean valid(TreeNode  root, long min, long max){
        if(root==null) return true;
        if(root.val<=min || root.val>=max) return false;
        boolean left = valid(root.left,min,root.val);
        if(left){
            boolean right = valid(root.right,root.val, max);
            return right;
        }
        return false;
    }
    public boolean isValidBST(TreeNode root) {
      return valid(root,Long.MIN_VALUE,Long.MAX_VALUE);        
    }
}