class Solution {
  public int possibleStringCount(String word) {
    //if any character repeats it could be error 
    //have to check for the group 
    int ans = 1;
    for(int i=1;i<word.length();i++){
      if(word.charAt(i-1)==word.charAt(i)) ans++;
      //just check with previous character 
    }
    return ans;
  }
}