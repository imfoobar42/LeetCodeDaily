class Solution {
    public char findTheDifference(String s, String t) {
        char ans = 0; 
        for(char ch:s.toCharArray()) ans^=ch; //xor with s
        for(char ch:t.toCharArray()) ans^=ch; // xor of ans with t,
        return ans; //xor removes everything common from s and t 
    }
}