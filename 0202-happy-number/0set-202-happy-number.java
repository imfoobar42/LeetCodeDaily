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
     Set<Integer> set = new HashSet<>();
      while(n!=1 && !set.contains(n)){
       set.add(n);
        n = sumOfSquares(n);
      }
      return n==1;
    }
}
