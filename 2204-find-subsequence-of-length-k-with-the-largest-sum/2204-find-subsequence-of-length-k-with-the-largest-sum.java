class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
      //top k maxm # and return their sum 
      PriorityQueue<Integer> minHeap = new PriorityQueue<>();
      for(int n:nums){
        minHeap.add(n);
        if(minHeap.size()>k)
          minHeap.poll();
      }
      int res[] = new int[k];
      int i =0;
      for(int n:nums){
        if(minHeap.contains(n)){
          res[i++]= n;
          minHeap.remove(n);
        }
      }
      return res;
    }
}