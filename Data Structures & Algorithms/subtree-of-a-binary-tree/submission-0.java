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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        String rootStr = traverse(root);
        String subtreeStr = traverse(subRoot);
        return rootStr.contains(subtreeStr);

    }
    public String traverse(TreeNode node){
        if(node == null ) return "null ,";

        return node.val + "" +traverse(node.left) + "" +traverse(node.right);
    }
}
