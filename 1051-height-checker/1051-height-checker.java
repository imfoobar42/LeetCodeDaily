class Solution {
    public int heightChecker(int[] heights) {
        //brute force 
        int[] expected = heights.clone();
        Arrays.sort(expected);
        int count = 0;
        int n = heights.length;
        for(int i=0;i<n;i++){
          if(heights[i]!=expected[i]) count++;
        }
        return count;
    }
}