class Solution {
  public int[] plusOne(int[] digits) {
    int n = digits.length;
    for (int i = n - 1; i >= 0; i--) {
      if (digits[i] < 9) {
        digits[i]++; //add the carry or 1
        return digits; //return once u see a number less than 9
      } else
        digits[i] = 0;
    }
    //when all digits are 9
    //replace the current array 
    digits = new int[n + 1];
    digits[0] = 1; //adding one to MSB
    return digits;
  }
}