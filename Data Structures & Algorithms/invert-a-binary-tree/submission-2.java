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
    public TreeNode invertTree(TreeNode root) {
        if(root == null) 
        return null;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
        TreeNode node = queue.poll();
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
        //Any order left or right any subtree
        if(node.right!=null) queue.add(node.right);
        if(node.left!=null) queue.add(node.left);
        
        
    }
        return root;
    
   }
}
