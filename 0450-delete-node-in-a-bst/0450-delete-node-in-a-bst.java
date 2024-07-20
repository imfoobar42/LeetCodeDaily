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
    
    public int min(TreeNode currentNode){
      while(currentNode.left!=null){
        currentNode = currentNode.left;
      }
      return currentNode.val;
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return null;
      //need to search the value 
      if(key < root.val) root.left = deleteNode(root.left,key);
      else if(key > root.val) root.right = deleteNode(root.right,key);
      else{ 
        //Node found
        //leaf node
        if(root.left==null && root.right==null) root = null;
        else if(root.right==null){ //node w left child
          root = root.left;
        }
        else if(root.left==null){ //node w right child
          root = root.right;
        }
        else{ //Internal node with left and right subtree
            int minValue = min(root.right);
            root.val = minValue;
            root.right = deleteNode(root.right,minValue);
        }
      } 
      return root;
    }
}