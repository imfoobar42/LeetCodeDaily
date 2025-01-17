class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
      int result = 0;
      int i=0, j=0;
      Arrays.sort(players);
      Arrays.sort(trainers);
      int n = players.length;
      int m = trainers.length;
      while(i<n && j<m){
        if(players[i]<=trainers[j]){
          result++;
          i++;
          j++;
        }
        else j++;
      }
      return result;
    }
}