class Solution {
    public int findKthLargest(int[] nums, int k) {
       //one way would be to create MaxHeap and poll k times or poll k-1 times and peek once
      //other efficient way would be to create heap of k size as we go through the input and return the final poll
      Queue<Integer> minHeap = new PriorityQueue<>();
      for(int n:nums){
        minHeap.add(n);
        if(minHeap.size()>k) minHeap.poll();
  //At any moment we have heap of size k containing K large elements till now
      }
      return minHeap.peek();
    }
}