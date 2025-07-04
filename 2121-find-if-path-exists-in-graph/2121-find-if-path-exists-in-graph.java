class Solution {
  public boolean dfs(ArrayList<ArrayList<Integer>> adjList, int src, int dest, int[] visited) {
    visited[src]=1;
    for(int adjacentNode: adjList.get(src)){
      if(adjacentNode==dest) return true;
      if(visited[adjacentNode]==0){
        if (dfs(adjList, adjacentNode, dest, visited))
         return true;
         }
    }
    return false;
  }

  public boolean validPath(int n, int[][] edges, int source, int destination) {
    //need to create my adjacency list
    if(source==destination) return true;
    ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      adjList.add(new ArrayList<>());
    }
    for (int i = 0; i < edges.length; i++) {
      adjList.get(edges[i][0]).add(edges[i][1]); //u-v
      adjList.get(edges[i][1]).add(edges[i][0]); //v-u
    }
    int visited[] = new int[n];
    return dfs(adjList, source, destination,visited);
  }

}