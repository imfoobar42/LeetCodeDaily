class Solution {
    //NLR 
    private boolean res = false;

    private void preOrder(TreeNode node, int targetSum, int currPathSum) {
        if (node == null)
            return;

        currPathSum += node.val;

        if (node.left == null && node.right == null) {
            if (currPathSum == targetSum) {
                res = true;
               }
             return;
            }
        

        preOrder(node.left, targetSum, currPathSum);
        preOrder(node.right, targetSum, currPathSum);

    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null)
            return false;
        preOrder(root, targetSum, 0);
        return res;
    }
}