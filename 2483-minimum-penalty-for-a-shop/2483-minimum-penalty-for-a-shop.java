class Solution {
  public int bestClosingTime(String customers) {
    int bestTime = 0;
    int prefix = 0;
    int minPenalty = 0;
    //if we see a Y then +1
    //if we see a N then -1 
    for(int i=0;  i<customers.length();i++){
      char ch = customers.charAt(i); //current char
      prefix += ch=='Y'?-1:1; //add to the prefix sum 
      if(prefix < minPenalty){ 
        minPenalty = prefix;
        bestTime = i+1;
      }
    }
      return bestTime;
  }
}