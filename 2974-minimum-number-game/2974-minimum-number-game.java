class Solution {
    public int[] numberGame(int[] nums) {
      int n = nums.length;
      if(n<2) return nums;
      Queue<Integer> minHeap = new PriorityQueue<>();
      for(int val:nums) minHeap.add(val);
      int i = 0;
      int[] result = new int[n];
      while(minHeap.size()>1){ //handling only the even ip
        int a = minHeap.poll();
        int b =  minHeap.poll();
        result[i] = b;
        result[i+1] = a;
        i += 2 ;
      }
      return result;
      
    }
}