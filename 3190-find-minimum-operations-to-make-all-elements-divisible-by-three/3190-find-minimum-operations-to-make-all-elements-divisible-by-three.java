class Solution {
    public int minimumOperations(int[] nums) {
        int count = 0;
        for(int num:nums){
            int res = num % 3;
            if(res==1 || res == 2) count++;
        }
        return count;
    }
}