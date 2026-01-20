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
    public void swap (TreeNode root){
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
    }
    public TreeNode invertTree(TreeNode root) {
        
        if(root == null){
            return null;
        }
        ArrayList<TreeNode> list = new ArrayList<TreeNode>();
        list.add(root);
        TreeNode head = null;
        while(list.size() >0){
            head = list.get(0);
            if(head.left != null){
                list.add(head.left);
            }
            if(head.right != null){
                list.add(head.right);
            }
            swap(head);
            list.remove(0);
        }
        
        return root;
    }
}