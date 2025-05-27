class Solution {
    static boolean even(int number){
      int digitCount = 0;
      while(number>0){
        digitCount++;
        number /= 10;
      }
      return digitCount%2==0;
    }
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int n:nums){
          if(even(n)) count++;
        }
        return count;
    }
}