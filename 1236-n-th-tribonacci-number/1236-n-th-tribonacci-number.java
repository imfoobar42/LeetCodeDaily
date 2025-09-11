class Solution {
    public int tribonacci(int n) {
        if(n==0) return 0;
        int first = 0;
        int second = 1;
        int third = 1;
        int temp1 = 0;
        int temp2 = 0;
        for(int i=3;i<=n;i++){
          temp1 = third;
          temp2 = second;
          third = third + second + first;
          second = temp1;
          first = temp2;
        }
        return third;
    }
}