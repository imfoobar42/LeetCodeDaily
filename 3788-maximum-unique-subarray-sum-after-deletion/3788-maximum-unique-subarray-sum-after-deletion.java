class Solution {
    public int maxSum(int[] nums) {
        int[] count = new int[101];
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int num:nums){
          if(num>0){
            if(count[num]==0){
              sum +=num;
            }
            count[num]++;
          }
          max = Math.max(max,num);
        }
        return max<0?max:sum;
    }
}