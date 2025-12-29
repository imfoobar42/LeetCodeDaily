class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max =0;
        for( int i :nums){
            if( i > max) max = i;

        }
        int ans = max;
        while(--k >0){
            max++;
            ans += max;
        }
        return ans;
    }
}
