/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    
    public int firstBadVersion(int n) {
      //first occurence problem 
      int start = 1;
      int end = n;
      while(start<=end){
        int mid = start + (end - start) / 2 ;
        if(isBadVersion(mid)) end = mid-1;
        else start = mid+1; 
    }
    //when you break out of the loop that means u have found our bad product
    return start;
} 
}