class Solution {
    public int sq(int n){
      return n*n;
    }
    public int sumOfSquares(int n){
      int sumS=0;
      while(n>0){
            sumS += sq(n%10);
            n /=10;
        }
      return sumS;
    }
    public boolean isHappy(int n) {
     int slow = n;
      int fast = n;
      do{
        slow = sumOfSquares(slow);
        fast = sumOfSquares(sumOfSquares(fast));
      }while(fast!=1 && slow!=fast);
        return fast==1;
    }
}