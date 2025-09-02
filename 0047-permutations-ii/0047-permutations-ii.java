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
          if(visited[i]==true) continue; //skip
          visited[i]= true;
          //current_num = nums[i];
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
        //int current_num = nums[0];
        permute(nums, visited, current, result);
        Set<List<Integer>> set= new HashSet<>(result);
        return new ArrayList<>(set);
    }
}