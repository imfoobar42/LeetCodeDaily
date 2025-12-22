class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] countArray = new int[10001]; //1 to n
        int[] res = new int[2];

        for(int num:nums) countArray[num]++;
        for(int i=1;i<=n;i++){
          if(countArray[i]==0) res[1]=i; //missing num
          if(countArray[i]==2) res[0]=i; //repeated num
        }
        return res;
        // TC: O(n) 
        // SC: O(n) for countArray
    }
}