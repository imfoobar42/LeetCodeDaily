class Solution {
    public void permute(
      int[] nums,
      //int current_num,
      boolean[] visited,
      List<Integer> current,
      List<List<Integer>> result){

        //base condition
        if(current.size()==nums.length){
          result.add(new ArrayList<>(current));
          return;
        }
        for(int i=0;i<nums.length;i++){
          if(visited[i]==true) continue; //skip for the same number
          if(i>0 && nums[i]==nums[i-1] && !visited[i-1]) continue;
          visited[i]= true;
          current.add(nums[i]);
          permute(nums, visited, current, result);
          current.remove(current.size()-1);
          visited[i]=false;
        }
      }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        Arrays.sort(nums);
        permute(nums, visited, current, result);
        return result;
    }
}