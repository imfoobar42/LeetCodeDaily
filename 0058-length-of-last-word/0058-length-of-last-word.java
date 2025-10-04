class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length();
        int index = n-1;
        int count = 0;
        //start from the end 
        //find the last character 
        while(index>=0 && s.charAt(index)==' ') index--;
        //now we reach a char which is not ' '
        while(index>=0 && s.charAt(index)!=' ') 
        {
          count++;
          index--;
        }
        //count # of characters till we get empty space 
        return count;
    }
}