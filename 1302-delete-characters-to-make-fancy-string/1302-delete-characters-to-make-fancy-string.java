class Solution {
  public String makeFancyString(String s) {
    //have to delete occurence of 3rd consecutive repeating character
    StringBuilder res = new StringBuilder();
    int count = 0; //to check freq of each character 
    for (int i = 0; i < s.length(); i++) {
      if (i > 0 && s.charAt(i - 1) == s.charAt(i)) {
        count++; //increment count 
      } else {
        count = 1; //reset count
      }
      if (count < 3)
        res.append(s.charAt(i));
    }
      return res.toString();
  }
}