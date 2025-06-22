/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

class Solution {
  public static int peakElement(MountainArray mountainArr) {
    int start = 0;
    int end = mountainArr.length() - 1;
    while (start < end) {
      int mid = start + (end - start) / 2;
      int midValue = mountainArr.get(mid);
      if (midValue > mountainArr.get(mid + 1))
        end = mid;
      else
        start = mid + 1;
    }
    return start;
  }

  public static int orderAgnosticBinarySearch(
    MountainArray mountainArr, int target,int start, int end) {
    boolean isAsc = mountainArr.get(start)< mountainArr.get(end);
    while (start <= end) {
      int mid = start + (end - start) / 2;
      int midValue = mountainArr.get(mid);
      if (midValue == target) return mid;
      if(isAsc){
      //increasing order sorted
      if(midValue< target) start = mid + 1;  
      else end = mid - 1;
    }
    else{
      //decreasing order sorted array
      if(mountainArr.get(mid)< target) end = mid-1;
      else start = mid + 1;
    }
  }
  return -1;
    }

  public int findInMountainArray(int target, MountainArray mountainArr) {
    //target can be a value which can be 
    //1. peak element 
    //2. random element not unique
    //3. random and unique 
    //task will be to find peak element and then do binary search till peak
    //in both directions
    int peak = peakElement(mountainArr);
    if (target == mountainArr.get(peak))
      return peak;
    //search in left half 
    int leftSearch = orderAgnosticBinarySearch(mountainArr, target,0,peak-1);
    if(leftSearch!=-1) return leftSearch;
    //search in right half
    //element not found return -1;
    return orderAgnosticBinarySearch(mountainArr, target, peak+1,mountainArr.length()-1);
  }
}