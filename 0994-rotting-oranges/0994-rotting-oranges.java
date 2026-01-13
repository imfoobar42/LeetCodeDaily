class Solution {
  //multiple source bfs
  class Orange {
    int row, col, exploredTime;

    Orange(int row, int col, int time) {
      this.row = row;
      this.col = col;
      this.exploredTime = time;
    }
  }

  public int orangesRotting(int[][] grid) {
    int row = grid.length;
    int col = grid[0].length;
    int[][] visited = new int[row][col];
    int countFreshOrange = 0;

    //bfs-q
    Queue<Orange> q = new ArrayDeque<>();

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        if (grid[i][j] == 2) { //rotten orange
          visited[i][j] = 2; //starting node 
          q.offer(new Orange(i, j, 0));
        } else if (grid[i][j] == 1) {
          countFreshOrange++;
        }
      }
    }
    int currentTime = 0;
    int countOrangesProcessed = 0;
    int[] dRow = { -1, 0, +1, 0 };
    int[] dCol = { 0, +1, 0, -1 };
    while (!q.isEmpty()) {

      int r = q.peek().row;
      int c = q.peek().col;
      int t = q.peek().exploredTime;
      currentTime = Math.max(t, currentTime);
      q.remove();

      for (int i = 0; i < 4; i++) {
        int nRow = r + dRow[i];
        int nCol = c + dCol[i];

        if (nRow >= 0 && nRow < row && nCol >= 0 && nCol < col && grid[nRow][nCol] == 1 && visited[nRow][nCol] == 0) {
          q.offer(new Orange(nRow, nCol, currentTime + 1)); //add it into the queue
          visited[nRow][nCol] = 2; //mark it visited
          countOrangesProcessed++;
        }
      }
    }
    return (countOrangesProcessed == countFreshOrange) ? currentTime : -1;
  }
}