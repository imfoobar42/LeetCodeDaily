//Solving using MaxHeap
​class Solution {
    public int maxProduct(int[] nums) {
       int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
//Using Max Heap--
      Queue<Integer> maxHeap = new PriorityQueue<>((a,b)->b-a);
      for(int n:nums) maxHeap.add(n);
      
      return (maxHeap.poll()-1)*(maxHeap.poll()-1);
    }
}
