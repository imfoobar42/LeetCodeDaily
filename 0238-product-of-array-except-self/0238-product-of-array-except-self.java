class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefixProduct = new int[n];
        int[] suffixProduct = new int[n];
        
        prefixProduct[0] = 1;
        for(int i=1;i<n;i++) prefixProduct[i] = nums[i-1] * prefixProduct[i-1];
        suffixProduct[n-1]=1;
        for(int j=n-2;j>=0;j--) suffixProduct[j] = nums[j+1]* suffixProduct[j+1];
        nums[0] = suffixProduct[0];
        nums[n-1]=prefixProduct[n-1];
        for(int k=1;k<n-1;k++){
          nums[k]=prefixProduct[k]*suffixProduct[k];
        }
        return nums;
    }
}