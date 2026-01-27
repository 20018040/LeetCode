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
    private boolean found = true;
    public boolean isBalanced(TreeNode root) {
        findDepth(root);
        return found;
    }
    public int findDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = 0;
        int right = 0;
        if(root.left != null){
            left = 1+ findDepth(root.left);
        }
        if(root.right != null){
            right = 1+ findDepth(root.right);
        }
        if(Math.abs(left-right)> 1){
            found = false;
        }
        return left >right ? left : right;
    }
}