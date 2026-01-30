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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> answer = new ArrayList<>();
        add(root,0,answer);
        return answer;
        
    }
    public void add(TreeNode root, int level, List<Integer>answer){
        if(root == null){
            return ;
        }
        if(answer.size() <= level){
            answer.add(root.val);
        }
        
            add(root.right,level +1,answer);
            add(root.left,level +1,answer);
        
    }
}