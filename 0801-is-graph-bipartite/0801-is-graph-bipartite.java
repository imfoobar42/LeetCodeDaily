class Solution {
  private boolean bfs(int srcNode, int parentNode, int[][] edges, int[] color) {

    color[srcNode]=0;
    Queue<Integer> queue = new LinkedList<>();
    queue.offer(srcNode);

    while (!queue.isEmpty()) {
      int currentNode = queue.poll();

      for (int adjacentNode : edges[currentNode]) {
        if (color[adjacentNode] == -1) {
          color[adjacentNode] = 1 - color[currentNode];
          queue.add(adjacentNode);
        } else if (color[adjacentNode] == color[currentNode])
          return false;
      }
    }
    return true;
  }

  public boolean isBipartite(int[][] edges) {
    int[] colors = new int[edges.length];
    Arrays.fill(colors, -1); // set all color to be -1
    // will visit each of the vertices and set the color
    for (int i=0;i<edges.length;i++) {
      if (colors[i]==-1 && !bfs(i, -1, edges, colors))
        return false;
    }
    return true;
  }

}
