class Solution {
  public String addStrings(String num1, String num2) {
    StringBuilder res = new StringBuilder();
    int p1 = num1.length() - 1;
    int p2 = num2.length() - 1;
    int carry = 0;
    int sum = 0;
    while (p1 >= 0 || p2 >= 0) {
      int value1 = p1>=0? num1.charAt(p1)-'0':0; //get value from p1
      int value2 = p2>=0? num2.charAt(p2)-'0':0; //get value from p2
      sum = (value1+ value2+ carry)%10;
      carry = (value1+ value2+ carry)/10 ;
      res.append(sum); //append the result from the sum;
      p1--; //decreement the ptr
      p2--;
    }
    if(carry!=0) res.append(carry); //non-zero carry has to be handled
    return res.reverse().toString();
  }
}