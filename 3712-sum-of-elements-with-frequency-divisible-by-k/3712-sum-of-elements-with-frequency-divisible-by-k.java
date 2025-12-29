class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int res = 0;
        int[] freqMap = new int[101];
        int n = nums.length;
        for(int i=0;i<n;i++){
          freqMap[nums[i]]++;
        }
        for(int j=1;j<101;j++) if(freqMap[j]%k==0) res+= j*freqMap[j];
        return res;
    }
}