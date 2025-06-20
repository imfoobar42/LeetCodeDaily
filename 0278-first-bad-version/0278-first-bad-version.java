/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    
    public int firstBadVersion(int n) {
      //first occurence problem 
      int start = 1;
      int end = n;
      int ans = 0;
      while(start<=end){
        int mid = start + (end - start) / 2 ;
        if(!isBadVersion(mid)){
          start = mid+1;
        }
        else{
          //isBadVersion(mid)== True
          ans = mid; //this could be a potential ans 
          end = mid-1;

      }
    }
    return ans;
} 
}