class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int n : nums){
          count += ((int) Math.log10(n) & 1); 
          //log to find the digit count
          //And to find if digit is odd or even based on it's LSB
        }
        return count;
    }
}