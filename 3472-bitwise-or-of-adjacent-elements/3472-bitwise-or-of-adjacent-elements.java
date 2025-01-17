class Solution {
    public int[] orArray(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n-1];
        int k = 0;
        for(int i=0;i<n-1;i++){
          arr[k++] = nums[i] | nums[i+1];
        }
        return arr;
    }
}