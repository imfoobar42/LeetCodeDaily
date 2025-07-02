class Solution {
  private boolean dfs(int srcNode, int color,int[][] edges, int[] colors) {
    colors[srcNode] = color;
    for (int adjacentNode : edges[srcNode]) {
      if (colors[adjacentNode] == -1) {
        if(!dfs(adjacentNode,1-color, edges, colors)) return false;
      } else if (colors[adjacentNode] == colors[srcNode])
        return false;
    }

    return true;
  }

  public boolean isBipartite(int[][] edges) {
    int[] colors = new int[edges.length];
    Arrays.fill(colors, -1); // set all color to be -1
    // will visit each of the vertices and set the color
    for (int i = 0; i < edges.length; i++) {
      if (colors[i] == -1 && !dfs(i,0,edges, colors))
        return false;
    }
    return true;
  }

}
