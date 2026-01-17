class Solution {
  public int heightChecker(int[] heights) {
//Approach - count sort
//1.Find the maximum element to get the range of values(k).
//Create a count array of size max + 1 
//Count the occurrences of each element in the input array 
//Calculate the cumulative sum (prefix sum) of the count array. 
//Build the output array by traversing the original input array in reverse order. 

        int[] countArray = new int[101];
        for(int height:heights) countArray[height]++;
        int count = 0;
        int i=0;
        for(int height:heights){
          while(countArray[i]==0) i++;
          if(height!=i) count++;
          countArray[i]--;
        }
        return count;
    }
}