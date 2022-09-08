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
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> s = new Stack<>();
        List<Integer> arr = new ArrayList<>();
        
        TreeNode curr = root;
        if(curr== null){
            return arr;
        }
        
        while(curr != null || !s.isEmpty()){
               while(curr!=null){
                   s.push(curr);
                   curr=curr.left;
               }
              curr = s.pop();
              arr.add(curr.val);
             curr=curr.right;
        }
        return arr;
        
    }
}