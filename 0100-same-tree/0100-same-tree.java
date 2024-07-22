import java.util.*;

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
    // Helper function to perform BFS traversal
    public List<Integer> BFS(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        while (!queue.isEmpty()) {
            TreeNode currentNode = queue.poll();
            if (currentNode == null) {
                list.add(null);
            } else {
                list.add(currentNode.val);
                queue.add(currentNode.left);
                queue.add(currentNode.right);
            }
        }
        
        return list;
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        // Edge case: both trees are null
        if (p == null && q == null) return true;
        
        // If only one of them is null
        if (p == null || q == null) return false;
        
        // Compare the BFS traversal of both trees
        List<Integer> listP = BFS(p);
        List<Integer> listQ = BFS(q);
        
        // Check if both lists have the same size and elements
        return listP.equals(listQ);
    }
}
