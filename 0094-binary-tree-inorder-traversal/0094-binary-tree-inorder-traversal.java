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

    public TreeNode inorder(TreeNode root,List<Integer> list){
        if(root == null){
            return root;
        }
        root.left=inorder(root.left,list);
        list.add(root.val);
        root.right=inorder(root.right,list);

        return root;
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();

       inorder(root,list);
        return list;
    }
}