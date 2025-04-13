/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode leftChild;
 *     TreeNode rightChild;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode leftChild, TreeNode rightChild) {
 *         this.val = val;
 *         this.leftChild = leftChild;
 *         this.rightChild = rightChild;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true; 
        return isSame(root.left, root.right);
    }
    public boolean isSame(TreeNode  leftChild, TreeNode rightChild){
        if(leftChild==null && rightChild==null) return true; //both left and rchild are null
        if(leftChild==null || rightChild==null) return false; //either 1 of them is null
        return (
          (leftChild.val == rightChild.val) &&  //values are same
        isSame(leftChild.right, rightChild.left) && //now compare child values
        isSame(leftChild.left, rightChild.right)
        );
    }
}