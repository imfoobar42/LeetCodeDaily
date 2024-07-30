class Solution {
    public  int lengthOfLongestSubstring(String s) {
    int n = s.length();
    if (n == 0) return 0; // Handle empty string case
    
    int[] hash = new int[256];
    int max = 0;
    int left = 0;

    for (int right = 0; right < n; right++) {
        char rightChar = s.charAt(right);
        hash[rightChar]++;
        
        while (hash[rightChar] > 1) {
            char leftChar = s.charAt(left);
            hash[leftChar]--;
            left++;
        }
        
        max = Math.max(max, right - left + 1);
    }

    return max;
}

}