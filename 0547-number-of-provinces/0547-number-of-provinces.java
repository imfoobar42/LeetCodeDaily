class Solution {
    private static void dfs(int i, int[][] isConnected, boolean[] visited){
      visited[i]= true;
      for(int adj=0;adj<isConnected[0].length;adj++){
        if(isConnected[i][adj]==1 && !visited[adj]){
          dfs(adj, isConnected, visited);
        }
      }
    }
    private static void bfs(int i, int[][] isConnected, boolean[] visited){
      Queue<Integer> queue = new LinkedList<>();
      visited[i]= true;
      queue.add(i);
      while(!queue.isEmpty()){
      int node = queue.poll();
        for(int adj=0;adj<isConnected[0].length;adj++){
          if(isConnected[node][adj]==1 && !visited[adj]){
            queue.add(adj); //node added to queue as it was not visited 
            visited[adj]= true; 
          }
        }
      }
    }
    public int findCircleNum(int[][] isConnected) {
        //given nxn matrix 
        //need to find no of connected components 
        //can use bfs or dfs to traverse 
        //maintain a visited array
        int row = isConnected.length;
        boolean visited[] = new boolean[row];
        //traverse the visited array 
        //do bfs on each node if not visited
        int count = 0;
        for(int i=0;i<row;i++){
            if (visited[i]==false){
              count++;
              dfs(i, isConnected, visited);
              //bfs(i, isConnected,visited);
          }
        }
      return count;
      //TC : O(N) +
      //SC : O(N) + O()
    }
}