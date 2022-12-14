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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> arr = new ArrayList<>();
        if(root==null) return arr;
        ArrayDeque<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> currArr = new ArrayList<>();
           while(size-- > 0){
               TreeNode temp = q.pop();
               currArr.add(temp.val);
               if(temp.left!=null)
                   q.add(temp.left);
               if(temp.right!=null)
                  q.add(temp.right);
           }
            arr.add(currArr); 
        }
        return arr;
    }
}