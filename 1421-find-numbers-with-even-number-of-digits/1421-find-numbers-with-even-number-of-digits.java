class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int n:nums){
          count += (int)Math.log10(n) & 1;
            //beautiful solution to the problem 
            //log10 returns always n-1 digits
            // anding with 1 checks for the odd value
            //but in actuality we are checking for even numbered digits only
        }
        return count;
    }
}
