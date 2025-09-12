class Solution {
    public boolean doesAliceWin(String s) {
      for(int i=0;i<s.length();i++){
        char ch = s.charAt(i);
        switch (ch) {
          case 'a','e','i','o','u':
            return true;
        }
      }
      return false;
}
}