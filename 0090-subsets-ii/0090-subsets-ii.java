class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
       List<List<Integer>> res = new ArrayList<>();
       List<Integer> subset = new ArrayList<>();

       Arrays.sort(nums);
       backtrack(0, nums, subset, res);
       return res; 
    }
    private void backtrack(int i, int[] nums, List<Integer> subset, List<List<Integer>> res){
        res.add(new ArrayList<>(subset)); //add subset to the result 

        for(int index=i;index<nums.length;index++){
          if(index>i && nums[index]==nums[index-1]) continue; //skip
          subset.add(nums[index]); //add num to subset
          backtrack(index+1, nums, subset, res); //next element
          subset.remove(subset.size()-1);
        }

    }
}