class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        if (n == 1) return 0; // No jumps needed if there's only one element

        int minJump = 0; // Count of jumps
        int currentEnd = 0; // End of the current jump range
        int maxIndex = 0; // Farthest point reachable

        for (int i = 0; i < n - 1; i++) {
            maxIndex = Math.max(maxIndex, i + nums[i]);

            // If we've reached the end of the current jump range
            if (i == currentEnd) {
                minJump++;
                currentEnd = maxIndex;

                // If the farthest point covers the last index, we're done
                if (currentEnd >= n - 1) break;
            }
        }

        return minJump;
    }
}
