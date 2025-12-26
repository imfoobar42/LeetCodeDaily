class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        int n = happiness.length;
        Arrays.sort(happiness); //sort the happiness array
        int count = 0; //keep track of children selected
        long max = 0;
        int currentHappiness = 0; //to track the happiness for each child
        for(int i=n-1;i>=0 && k>0;i--){
          currentHappiness = Math.max(0,happiness[i]-count); //minm happiness can go is 0
          max+=currentHappiness;
          k--;
          count++;
        }    
        return max;
    }
}