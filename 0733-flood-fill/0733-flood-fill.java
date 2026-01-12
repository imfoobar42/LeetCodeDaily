class Solution {
  private void dfs(int[][] image, int sr, int sc, int color, int startingColor) {
    if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length ||
        image[sr][sc] == color || image[sr][sc] != startingColor)
      return;
    //set color of the current node 
    image[sr][sc] = color;
    //call dfs on adjacent nodes 
    dfs(image, sr + 1, sc, color, startingColor);
    dfs(image, sr, sc + 1, color, startingColor);
    dfs(image, sr - 1, sc, color, startingColor);
    dfs(image, sr, sc - 1, color, startingColor);
  }
  public int[][] floodFill(int[][] image, int sr, int sc, int color) {
    //just call dfs on starting node
    int startingColor = image[sr][sc];
    if (startingColor != color)
      dfs(image, sr, sc, color, startingColor);
    return image;
  }

}