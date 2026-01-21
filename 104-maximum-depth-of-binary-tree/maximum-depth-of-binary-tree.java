
class Solution {
    public int recursive(TreeNode root, int highest, int depth){
        int left = depth;
        int right = depth;
        if(root.left != null){
            left = recursive(root.left,highest,depth+1);
        }
        if(root.right != null){
            right = recursive(root.right,highest,depth+1);
        }
        return left>right ? left : right;
    }
    public int maxDepth(TreeNode root) {
        if(root == null)return 0;
        int depth =1;
        int highest = 0;
        return recursive(root,highest,depth);
    }
}