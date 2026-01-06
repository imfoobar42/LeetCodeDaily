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
  public int maxLevelSum(TreeNode root) {
    //level order traversal - bfs 
    Queue<TreeNode> queue = new ArrayDeque<>();
    queue.offer(root); //add root 

    int currentLevel = 1;
    int maxLevelSum = Integer.MIN_VALUE;
    int levelWithMaxSum = 1;

    while (!queue.isEmpty()) {
      int levelSum = 0;
      int qSize = queue.size(); //read only nodes at current Level

      for (int i = 0; i < qSize; i++) {
        TreeNode currentNode = queue.poll(); //process the currentNode
        levelSum += currentNode.val;

        if (currentNode.left != null)
          queue.offer(currentNode.left);
        if (currentNode.right != null)
          queue.offer(currentNode.right);
      }

      if (levelSum > maxLevelSum) {
        maxLevelSum = levelSum;
        levelWithMaxSum = currentLevel;
      }
      currentLevel++;
    }
    return levelWithMaxSum;
  }
}