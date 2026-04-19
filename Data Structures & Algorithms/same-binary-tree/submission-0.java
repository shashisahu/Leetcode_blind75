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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;

        Queue<TreeNode> pq = new LinkedList<>();
        Queue<TreeNode> qq = new LinkedList<>();
        pq.add(p);
        qq.add(q);
        // check && condition if any queue is left it will return false
        while(!pq.isEmpty() && !qq.isEmpty()){
            TreeNode pnode = pq.poll();
            TreeNode qnode = qq.poll();
            if(pnode == null && qnode ==null) continue;
            if(pnode == null || qnode ==null) return false;
            if(pnode.val != qnode.val) return false;
          // add everything irrespective of null nodes
           pq.add(pnode.left);
           pq.add(pnode.right);
           qq.add(qnode.left);
           qq.add(qnode.right);
        }

        return pq.isEmpty() && qq.isEmpty();


        
    }
}
