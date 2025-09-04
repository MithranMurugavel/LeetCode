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
    public static TreeNode findMin(TreeNode temp){
        
        while(temp.left !=null){
            temp=temp.left;
        }
        TreeNode t=temp;
        temp=null;
        return t;
    }
    public TreeNode deleteNode(TreeNode root, int key) {

        if(root==null) return root;

        if(root.val>key){
            root.left=deleteNode(root.left,key);
        }
        else if(root.val<key){
            root.right=deleteNode(root.right,key);
        }

        else{
            if(root.left==null && root.right==null){
                root=null;
                return root;
            }
            else if(root.left==null){
                root=root.right;
                return root;
            }
            else if(root.right==null){
                root=root.left;
                return root;
            }
            else{

                TreeNode temp=findMin(root.right);
                root.val = temp.val;
                root.right=deleteNode(root.right,temp.val);
                return root;
            }
        }
        return root;
    }
}