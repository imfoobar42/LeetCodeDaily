class Solution {
    public int maxArea(int[] height) {
       int n = height.length;
       int volume = 0; 
       int i = 0;
       int j = n-1;
       //compare volume at i and j, then keep moving
       while(i<j){
        int distance = j-i;
        int minBar = Math.min(height[i],height[j]);
        volume = Math.max(distance*minBar, volume);
        if(height[i]<height[j]) i++; //move i forward
        else j--; //move j 
       }
       return volume;
    }
    //TC: O(n)
    //SC : O(1)
}