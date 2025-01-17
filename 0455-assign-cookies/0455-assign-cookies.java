class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int gLength = g.length;
        int sLength = s.length;
        //if Parent has no cookie to offer 
        if(sLength==0) return 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0, j=0;
        int result = 0;
        while(i<gLength && j<sLength){
          if(g[i]<=s[j]){
            result++;
            i++;
            j++;
          }
          else j++;
        }
        return result;
    }
}