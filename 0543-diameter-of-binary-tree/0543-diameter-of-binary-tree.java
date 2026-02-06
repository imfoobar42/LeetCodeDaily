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
    private int height(TreeNode root){
        if(root==null) return 0;
        int lHeight = height(root.left);
        int rHeight = height(root.right);
        int diameter = lHeight+rHeight;
        largestDiameter = Math.max(diameter, largestDiameter);
        return 1 + Math.max(lHeight,rHeight);
    }
    private int largestDiameter = Integer.MIN_VALUE;
    public int diameterOfBinaryTree(TreeNode root) {
        //diameter = h_left_subtree + h_right_subtree
        height(root);
        return largestDiameter;
    }
}