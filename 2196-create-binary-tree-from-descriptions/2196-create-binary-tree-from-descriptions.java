/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
  public TreeNode createBinaryTree(int[][] descriptions) {
    Map<Integer, TreeNode> nodesInfo = new HashMap<>();
    Set<Integer> children = new HashSet<>();
    for (int[] description : descriptions) {
      int parentVal = description[0];
      int childVal = description[1];
      boolean isLeft = description[2] == 1; // left =1

      // Created Parent Node
      nodesInfo.putIfAbsent(parentVal, new TreeNode(parentVal));
      TreeNode parentNode = nodesInfo.get(parentVal);

      // Created Child Node
      nodesInfo.putIfAbsent(childVal, new TreeNode(childVal));
      TreeNode childNode = nodesInfo.get(childVal);
      // Left or right Child
      if (isLeft)
        parentNode.left = childNode;
      else
        parentNode.right = childNode;

      // Add childNode to children set
      children.add(childVal);
    }
    // keyset returns the value
    for (int childValue : nodesInfo.keySet()) {
      if (!children.contains(childValue))
        return nodesInfo.get(childValue);
    }
    return null;
  }
}