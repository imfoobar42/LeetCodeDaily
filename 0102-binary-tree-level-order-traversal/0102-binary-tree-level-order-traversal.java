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
    List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null) return list;

        //Maintain a Queue of TreeNode type
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
          int size = queue.size();
          List<Integer> currentList = new ArrayList<>();
          for(int i=0;i<size;i++){
            TreeNode current = queue.poll(); //remove queue element 
            currentList.add(current.val);   
            if(current.left !=null) queue.offer(current.left);
            if(current.right!=null) queue.offer(current.right);
          }
            list.add(currentList);
        }
        return list;
    }
}