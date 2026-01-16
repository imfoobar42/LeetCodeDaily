class Solution {
  private boolean dfs(int src, int dest, int[] visited, ArrayList<ArrayList<Integer>> adjList){
      if(src==dest) return true; //base case 
      visited[src]=1; //mark it visited

      for(int node:adjList.get(src)){
        if(node==dest) return true;
        if(visited[node]==0){
          if(dfs(node,dest,visited,adjList)==true) return true;
        }
      }
      return false;
    }

  public boolean validPath(int n, int[][] edges, int source, int destination) {
    ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
    for (int i = 0; i < n; i++)
      adjList.add(new ArrayList<>());
    for (int[] edge : edges) {
      adjList.get(edge[0]).add(edge[1]); //u-v
      adjList.get(edge[1]).add(edge[0]); //v-u
    }
    int[] visited = new int[n]; //visited array
    return dfs(source, destination, visited, adjList);
  }
}