class Solution {
  public int peakIndexInMountainArray(int[] arr) {
    int start = 0;
    int end = arr.length - 1;
    while (start < end) {
      int mid = start + (end - start) / 2;
      if (arr[mid] > arr[mid + 1]) {
        //we are on decreasing side of the elements 
        //larger element could be on the left side
        //including the mid element
        end = mid; // our search now becomes from start to mid 
      } else
        start = mid + 1; //we are on increasing side
      //need to check further along in the list
    }
    return start; //can return start or end 
  }
}