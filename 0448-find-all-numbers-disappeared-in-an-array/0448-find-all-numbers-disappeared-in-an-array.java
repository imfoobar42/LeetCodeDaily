class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int n = nums.length;
        int count[] = new int[100001];
        for(int num:nums) count[num]++; //get the count of each element
        for(int i=1;i<=n;i++){
          if(count[i]==0) res.add(i);
        }
        return res;
    }
}