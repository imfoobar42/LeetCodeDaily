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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();

        if(root==null) return res;

        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.offer(root);
        boolean flag = false; //set a flag to check the order

        while(!deque.isEmpty()){
            int size = deque.size();
            List<Integer> currentList = new ArrayList<>();

            for(int i=0;i<size;i++){
                if(!flag) //flag not set 
                {
                    TreeNode currentNode = deque.pollFirst();
                    if(currentNode.left!=null) deque.offerLast(currentNode.left);
                    if(currentNode.right!=null) deque.offerLast(currentNode.right);
                    currentList.add(currentNode.val);
                }
                else {
                    TreeNode currentNode = deque.pollLast();
                    if(currentNode.right!=null) deque.offerFirst(currentNode.right);
                    if(currentNode.left!=null) deque.offerFirst(currentNode.left);
                    currentList.add(currentNode.val);
                    }

            }
            flag = !flag; //reverse the flag
            res.add(currentList);
        }
        return res;
    }
}