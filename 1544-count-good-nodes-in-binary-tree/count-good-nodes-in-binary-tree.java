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
    public int goodNodes(TreeNode root) {
        return checkNode(root,root.val);
    }
    public int checkNode(TreeNode root,int Max){
        if (root == null){
            return 0;
        }
        if(root.val >= Max){
            Max = root.val;
            return 1+ checkNode(root.left, Max) + checkNode(root.right,Max);
        }
        return checkNode(root.left, Max) + checkNode(root.right,Max);
    }
}