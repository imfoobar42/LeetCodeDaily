class Solution {
    
    
    public int[] topKFrequent(int[] nums, int k) {
        //k can be any # of freq elements 
        int len = nums.length;
        if (k==len) return nums;
        Map<Integer, Integer> map = new HashMap<>();
        for(int n:nums){
          map.put(n, map.getOrDefault(n, 0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> minHeap= new PriorityQueue<>(
          (a,b)-> a.getValue()-b.getValue() //minheap with their Frequencies
          );
        for(Map.Entry<Integer, Integer > entry: map.entrySet()){
          minHeap.offer(entry);
          if(minHeap.size()>k)
            minHeap.poll();
        }
        int res[] = new int[k];
        int i =0;
        while(!minHeap.isEmpty()){
          res[i++]= minHeap.poll().getKey();
        }
    return res;
    }
}