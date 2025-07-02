class Solution {
    public int sumOfUnique(int[] nums) {
        int[] freq = new int[101];
        int res=0;
        for(int n:nums){
          freq[n]++;
        }
        for(int i=1;i<101;i++){
          if(freq[i]==1) res+=i;
        }
        return res;
    }
}