class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
      int n = intervals.length;
      if(n==1) return 0;
      Arrays.sort(intervals,(a,b)->Integer.compare(a[0], b[0]));  
      int endTime = intervals[0][1];
      int count=1;
      for(int i=1;i<n;i++){
        if(endTime <= intervals[i][0]) {
          endTime = intervals[i][1];
          count++;
      }
      else endTime = Math.min(endTime,intervals[i][1]); //choose interval that finishes first
    }
    return n-count;
  }
}