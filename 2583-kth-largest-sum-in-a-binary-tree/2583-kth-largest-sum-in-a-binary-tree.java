
class Solution {
  public long kthLargestLevelSum(TreeNode root, int k) {
    //Approach - Level Order Traversal 
    //min heap of size k to store maxValues
    //get sum of nodes at each level
    if(root==null) return -1;
    
    Queue<TreeNode> queue = new ArrayDeque<>();
    queue.offer(root); //add the root

    PriorityQueue<Long> minHeap = new PriorityQueue<>();
    while (!queue.isEmpty()) {

      long levelSum = 0; //current level sum 
      int qSize = queue.size(); //# of nodes at current level 

      for (int i = 0; i < qSize; i++) {
        TreeNode currentNode = queue.poll(); //get currentNode 
        levelSum += currentNode.val;

        if (currentNode.left != null)
          queue.offer(currentNode.left);
        if (currentNode.right != null)
          queue.offer(currentNode.right);

      }
      minHeap.offer(levelSum); //add the element
      if (minHeap.size() > k)
        minHeap.poll();

    }
    //minHeap size as at every level we add levelSum
    return minHeap.size() < k ? -1 : minHeap.peek(); //O(1) for peek
  }
}
//TC : O(N + LlogK) - BFS + Heap operations (Offer, Poll)
//SC : O(N + K) - Queue + O(K) - minHeap