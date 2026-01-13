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
    int countFreshOrange = 0;

    //bfs-q
    Queue<Orange> q = new ArrayDeque<>();

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        if (grid[i][j] == 2) {
          //starting node 
          q.offer(new Orange(i, j, 0));
        } else if (grid[i][j] == 1) {
          countFreshOrange++;
        }
      }
    }
    int currentTime = 0;
    int[][] dRowCol = { { -1, 0 }, { 0, 1 }, { 1, 0 }, { 0, -1 } };

    while (!q.isEmpty()) {

      Orange o = q.poll();
      currentTime = Math.max(currentTime, o.exploredTime);

      for (int dir[] : dRowCol) {
        int nRow = o.row + dir[0];
        int nCol = o.col + dir[1];

        if (nRow >= 0 && nRow < row && nCol >= 0 && nCol < col && grid[nRow][nCol] == 1) {
          q.offer(new Orange(nRow, nCol, o.exploredTime + 1)); //add it into the queue
          grid[nRow][nCol] = 2; //mark it rotten
          countFreshOrange--;
        }
      }
    }
    return countFreshOrange == 0 ? currentTime : -1;
  }
}