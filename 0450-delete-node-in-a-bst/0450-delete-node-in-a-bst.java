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
    // Inorder Successor from the subtree
    public int min(TreeNode currentNode) {
        while (currentNode.left != null) {
            currentNode = currentNode.left;
        }
        return currentNode.val;
    }

    public TreeNode deleteNode(TreeNode root, int key) {
        TreeNode currentNode = root;
        if (currentNode == null) {
            return null;
        }

        if (key < currentNode.val) {
            currentNode.left = deleteNode(currentNode.left, key);
        } else if (key > currentNode.val) {
            currentNode.right = deleteNode(currentNode.right, key);
        } else {
            // Node to be deleted found
            if (currentNode.left == null && currentNode.right == null) {
                return null; // Leaf node
            } else if (currentNode.left == null) {
                return currentNode.right; // Node with only right child
            } else if (currentNode.right == null) {
                return currentNode.left; // Node with only left child
            } else {
                // Node with two children
                int minValue = min(currentNode.right);
                currentNode.val = minValue;
                currentNode.right = deleteNode(currentNode.right, minValue);
            }
        }
        return currentNode;
    }
}
