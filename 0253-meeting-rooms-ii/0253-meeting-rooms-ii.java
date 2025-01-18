class Solution {
    public int minMeetingRooms(int[][] intervals) {
        Arrays.sort(intervals, (a,b)->Integer.compare(a[0],b[0]));
        Queue<Integer> pq = new PriorityQueue<>(); //maintain a heap of endtimes
        for(int i=0;i<intervals.length;++i){
          if(!pq.isEmpty() && pq.peek()<=intervals[i][0]) pq.poll(); //remove 
          pq.offer(intervals[i][1]); //add latest end time
        }
        return pq.size();

    }
}