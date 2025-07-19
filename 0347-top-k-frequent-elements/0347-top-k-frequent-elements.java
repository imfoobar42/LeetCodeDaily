

import javax.swing.RowFilter.Entry;

class Solution {
    class Res{
      int num;
      int frequency;
      Res(int num,int frequency){
        this.num = num;
        this.frequency = frequency;
      }
    }
    public int[] topKFrequent(int[] nums, int k) {
        //k can be any # of freq elements 
        int len = nums.length;
        if (k==len) return nums;
        Map<Integer, Integer> map = new HashMap<>();
        for(int n:nums){
          map.put(n, map.getOrDefault(n, 0)+1);
        }
        PriorityQueue<Res> minHeap= new PriorityQueue<>(
          Comparator.comparingInt(a-> a.frequency)
          );
        for(Map.Entry<Integer, Integer > entry: map.entrySet()){
          minHeap.offer(new Res(entry.getKey(),entry.getValue()));
          if(minHeap.size()>k)
            minHeap.poll();
        }
        int res[] = new int[k];
        for(int i=0;i<k;i++){
          res[i]=minHeap.poll().num;
        }
    return res;
    }
}