import java.math.BigInteger;
class Solution {
  public int numTrees(int n) {
    //catlan Number 
    BigInteger catlanNum = BigInteger.ONE;

    for (int i = 1; i <= n; i++) {
      catlanNum = catlanNum.multiply(BigInteger.valueOf(n + i)).divide(BigInteger.valueOf(i));
    }
    catlanNum = catlanNum.divide(BigInteger.valueOf(n+1));
    return catlanNum.intValue();
  }
}