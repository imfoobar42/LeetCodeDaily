class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int n:nums){
          count += (int)Math.log10(n) & 1;
        }
        return count;
    }
}
