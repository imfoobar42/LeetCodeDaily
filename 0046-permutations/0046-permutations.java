class Solution {
    private void permute(
      int[] nums,
      List<List<Integer>> res,
      List<Integer> curr,
      boolean[] visited
    ){
      if(curr.size()==nums.length){ //base case 
        //exploration done 
        res.add(new ArrayList<>(curr));
        return;
      }
      for(int i=0;i<nums.length;i++){
        if(visited[i]==true) continue; //skip
        visited[i]=true; //set visited for current element to be true
        curr.add(nums[i]);
        permute(nums,res,curr,visited); //permute on next numbers 
        curr.remove(curr.size()-1); //remove the current element
        visited[i]= false; 
      }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        List<Integer> curr = new ArrayList<>();
        permute(nums,res,curr,visited);
        return res;
    }
}