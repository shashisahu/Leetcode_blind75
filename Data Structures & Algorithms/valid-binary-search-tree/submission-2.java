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
    // inorder traversal strictly increasing order
    int prev = Integer.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {    
        return isInOrder(root);    
    }

    private boolean isInOrder(TreeNode node){
        if(node == null) return true;
        if(!isInOrder(node.left)) return false;

        if(prev!=Integer.MIN_VALUE && node.val <= prev){
            
            return false;
        }
        prev = node.val;

        return isInOrder(node.right);
        //return true;
    }
}
