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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> answer = new ArrayList<>();
        add(root,0,answer);
        return answer;
    }
    public List<List<Integer>> add(TreeNode root, int level, List<List<Integer>> list ){
        if(root == null){
            return list;
        }
        if(list.size() <= level){
            list.add(new ArrayList<Integer>());
        }
        list.get(level).add(root.val);
        list = add(root.left, level+1,list);
        list = add(root.right, level+1, list);
        return list;
    }
}