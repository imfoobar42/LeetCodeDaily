class Solution {
    private static void dfs(
      char[][] grid, 
      int[][] visited,
      int i, int j,
      int row,int col)
      {
      //check its neighbor
      //base condition 
      if(i>=0 && j>=0 && i<row && j<col && grid[i][j]=='1' && visited[i][j]==0){
      visited[i][j]=1; //visited the node 
      dfs(grid, visited, i+1, j, row, col); //next row element
      dfs(grid, visited, i, j+1, row, col); //next col element 
      dfs(grid, visited, i, j-1, row, col); //prev col element 
      dfs(grid, visited, i-1, j, row, col); //prev row element
        }
      }
    public int numIslands(char[][] grid) {
        int cnt = 0;
        int row = grid.length; //no of nodes
        int col = grid[0].length;
        //visited array to track visited nodes
        int[][] visited = new int[row][col];
        //treat every value like an island
        for(int i=0; i<row;i++){
          for(int j=0; j<col; j++){
            if(visited[i][j]==0 && grid[i][j]=='1'){
              cnt++;
              dfs(grid, visited, i,j,row, col);
            }
          }
        }
        
        return cnt;
    }
}