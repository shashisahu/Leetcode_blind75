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
//“Swap first, then go deeper.
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) 
        return null;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()){
        TreeNode node = stack.pop();

        //“Swap first, then go deeper.”

        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
        //Any order left or right any subtree
        if(node.right!=null) stack.push(node.right);
        if(node.left!=null) stack.push(node.left);
        
        
    }
        return root;
    
   }
}
