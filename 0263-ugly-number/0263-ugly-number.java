class Solution {
    public boolean isUgly(int n) {
     //divisible by 2, 3, 5, 6, 
     //how do u find the prime factors of a #   
     if (n<1) return false;
     for (int factor: new int[]{2,3,5}){
      //keep dividing the number by factors
        while(n%factor==0){
          n /= factor;
        }
     }
      return n==1;
    }
}