class Solution {
  public String largestGoodInteger(String num) {
    String[] pattern = {
        "999", "888", "777", "666", "555", "444", "333", "222", "111", "000"
    };
    //return largest pattern #
    for (String p : pattern) {
      if (num.contains(p)) {
        return p;
      }
    }
    return "";
  }
}