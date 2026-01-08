class Solution {
  public int removeDuplicates(int[] nums) {
        //skip when freq of nums[i]>2 
        //else add it to the nums count 
        //modify nums
        //brute force ->
        //iterate over the array 
        //map 
        Map<Integer, Integer> map = new HashMap<>();
        //num -key
        //count - value 
        for(int num:nums){
          map.put(num, map.getOrDefault(num,0)+1);
        }
        int i =0;
        int j = 0;
        while(i<nums.length){
          int count = map.get(nums[i]);
          nums[j++]= nums[i]; 
          if(count>=2) nums[j++]=nums[i];
          i+=count;
        }
        return j;
    }
}