class Solution {
  private void dfs(int src, int dest, List<Integer> currentPath, List<List<Integer>> res,
      int[][] graph) {
    
    currentPath.add(src);
    
    if (src == dest) { //base case
      res.add(new ArrayList<>(currentPath));
      currentPath.remove(currentPath.size()-1);
      return;
    }
    for (int adjNode : graph[src])  dfs(adjNode, dest, currentPath, res, graph);
    
    //backtrack
    currentPath.remove(currentPath.size()-1);
  }

  public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
    int n = graph.length;
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> currentPath = new ArrayList<>();
    dfs(0, n - 1, currentPath, res, graph);
    return res;
  }
}