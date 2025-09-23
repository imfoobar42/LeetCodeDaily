class Solution {
    public int maxFrequencyElements(int[] nums) {
        int maxFreq = 0;
        int[] freqMap = new int[101];
        for(int n:nums){
          freqMap[n]++; //increasing count of num
          maxFreq = freqMap[n]> maxFreq? freqMap[n]: maxFreq;
        }
        int res = 0;
        for(int n:freqMap){
          if(n==maxFreq) res+= n;
        }
        return res;
    }
}