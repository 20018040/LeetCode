class Solution {
    private boolean found = true;

    public boolean isBalanced(TreeNode root) {
        findDepth(root);
        return found;
    }

    private int findDepth(TreeNode root) {
        if (root == null || !found) {
            return 0; // stop recursion early if already unbalanced
        }

        int left = findDepth(root.left);
        int right = findDepth(root.right);

        if (Math.abs(left - right) > 1) {
            found = false;
        }

        return 1 + Math.max(left, right);
    }
}
