class Solution {
    private static void dfs(int[][] image, int sr, int sc, int color, int startingColor){
      if(sr<0|| sc<0 || sr>=image.length || sc>=image[0].length || image[sr][sc]==color || image[sr][sc]!=startingColor)
      return;
      image[sr][sc]= color;
      dfs(image, sr-1, sc, color,startingColor);
      dfs(image, sr+1, sc, color,startingColor);
      dfs(image, sr, sc+1, color, startingColor);
      dfs(image, sr, sc-1, color, startingColor);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        //the value in the image itself is a node
        int startingColor = image[sr][sc];
        if(startingColor!=color){
          dfs(image,sr,sc,color, startingColor);
        }  
        return image;
    }
}