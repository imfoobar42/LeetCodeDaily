class KthLargest {
    private Queue<Integer> minHeap;
    private int k;
  
    public KthLargest(int k, int[] nums) {
      this.k = k;  
      minHeap =  new PriorityQueue<>(k);
      for(int n:nums) add(n); //add value using the add function only
    }
    
    public Integer add(int val) {
        minHeap.add(val);
      if(minHeap.size()>k) {
        minHeap.poll();
      } 
    //will maintain a heap of k large elements and return the kth largest
      return minHeap.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */