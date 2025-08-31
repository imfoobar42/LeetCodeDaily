class Solution {
    public void backtrack(
      int[] nums,List<List<Integer>> res, List<Integer> curr, int index){
        res.add(new ArrayList<>(curr));
        for(int i=index;i<nums.length;++i){
          curr.add(nums[i]); //added current element to the curr subsets
          backtrack(nums,res,curr,i+1); //check for next element 
          curr.remove(curr.size()-1); //remove the added nums[i]
        }
      }
    
    public List<List<Integer>> subsets(int[] nums) {
       List<List<Integer>> res= new ArrayList<>();
       List<Integer> curr = new ArrayList<>();
       backtrack(nums,res,curr,0); 
       return res;
    }
}