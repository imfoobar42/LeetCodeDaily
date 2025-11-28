class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k); //minHeap to store k large elements encountered
        //iterate through all elements
        for(int n:nums){
          //if current element is greater than 
          //the root, it can be the kth largest so add it to minHeap
          if(minHeap.size()<k) minHeap.add(n); //heap size less than k, then keep adding 
          else if(n>minHeap.peek()){
            //delete root 
            minHeap.poll();
            minHeap.add(n);
          }
        }
        return minHeap.peek();
    }
  //TC : O(nlogk)
  //SC : O(k)
}