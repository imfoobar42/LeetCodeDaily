class Solution {
    public int islandPerimeter(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int p = 0;
        //math problem - since only 1 island
        //dont need to traverse 
        for(int i=0;i<r;i++){
          for(int j=0;j<c;j++){
            if(grid[i][j]==1){
              p +=4; //add 4 to perimeter as we traverse from left to right 
              if(i>0 && grid[i-1][j]==1) p-=2; //upper cell 
              if(j>0 && grid[i][j-1]==1) p-=2; //prev cell 
            }
          }
        }
        return p;
    }
}