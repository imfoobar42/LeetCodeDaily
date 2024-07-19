class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
      List<Integer> list = new ArrayList<>();
      int row = matrix.length;
      int col = matrix[0].length;
      for(int i=0;i<row;i++){
        int minValueRow = Integer.MAX_VALUE; //minValue in that row 
        int minColIndex = -1;
        for(int j=0;j<col;j++){
          if(matrix[i][j] < minValueRow) {
            minValueRow = matrix[i][j];
            minColIndex = j; //coln in which min Value of Row exists
        }
        }
        //got minm value and coln index where minm occurs 
        //will now check if its a max value in its coln 
        boolean isLucky = true; //set a flag for no.
        for(int k=0;k<row;k++){
          if(matrix[k][minColIndex] > minValueRow) {
           isLucky = false;
            break;
          }
        }
        if(isLucky) list.add(minValueRow);
        
      }
      return list;
    }
}