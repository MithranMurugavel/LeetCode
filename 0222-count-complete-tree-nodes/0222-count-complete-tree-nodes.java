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

    private int countNodes(TreeNode root, int count){

        if(root == null) return 0;
        
        count = 1+countNodes(root.left,count)+countNodes(root.right,count);
        return count;
    }
    public int countNodes(TreeNode root) {
        

        return countNodes(root,0);

    }
}