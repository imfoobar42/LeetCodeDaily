class Solution {
    private static void dfs(int node, List<List<Integer>> list, int[] visited){
      visited[node] = 1;
      for(int adjNodes = 0; adjNodes< list.get(node).size();adjNodes++){
          int adjacentNode = list.get(node).get(adjNodes);
          if(visited[adjacentNode]!=1){
            dfs(adjacentNode, list, visited);
          }
      }
    }
    public int countComponents(int n, int[][] edges) {
      int cnt = 0;
      List<List<Integer>> adjList = new ArrayList<>();
      //creating an adjacency list
      for(int i=0;i<n;i++){
        adjList.add(new ArrayList<>());
      }
      for(int i=0;i<edges.length;i++){
         adjList.get(edges[i][0]).add(edges[i][1]);
         adjList.get(edges[i][1]).add(edges[i][0]);
        }
      
      int[] visited = new int[n];
      for(int i=0;i<n;i++){
        if(visited[i]==0){
          cnt++;
          dfs(i,adjList, visited);
        }
      }
      return cnt;
    }
}