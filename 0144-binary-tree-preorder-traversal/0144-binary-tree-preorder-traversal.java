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
    public void preorderTraversal(TreeNode root,List<Integer> arr){
        if(root==null) return;

        arr.add(root.val);
        preorderTraversal(root.left,arr);
        preorderTraversal(root.right,arr);
        return ;
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list= new ArrayList<>();
        preorderTraversal(root,list);
        return list;
    }
}