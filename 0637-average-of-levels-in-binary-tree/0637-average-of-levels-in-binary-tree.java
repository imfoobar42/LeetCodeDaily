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
    //levels - bfs traversal 
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();
        if(root==null) return res;
        //queue 
        
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int levelSize = queue.size(); 
            double currentSum = 0; //reinitialize sum at every level 
            for(int i=0;i<levelSize; i++){
                TreeNode currentNode = queue.poll(); //delete the node 
                currentSum += currentNode.val;
                if(currentNode.left!=null) queue.offer(currentNode.left);
                if(currentNode.right!=null) queue.offer(currentNode.right);
            }
            res.add(currentSum/levelSize);
        }
        return res;
    }
}