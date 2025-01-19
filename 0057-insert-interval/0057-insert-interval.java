class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
      int n = intervals.length;
      if(n==0) return new int[][]{newInterval};
      int i =0;
      List<int[]> list = new ArrayList<>();
      //left part
      //new interval occurs after left part
      while(i<n && intervals[i][1]< newInterval[0]){
           list.add(intervals[i]);
           i++; 
      }

      //merge part 
      //does the interval start before my interval ends ?
      while(i<n && intervals[i][0] <=newInterval[1]){
           newInterval[0]=Math.min(intervals[i][0],newInterval[0]);
           newInterval[1]=Math.max(intervals[i][1], newInterval[1]);
           i++; 
      }
      list.add(newInterval);

      //end part
      while(i<n){
        list.add(intervals[i]);
        i++;
      }

      return list.toArray(new int[list.size()][]);
    }
}