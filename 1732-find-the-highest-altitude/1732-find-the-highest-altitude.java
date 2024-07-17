class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int currentAltitude = 0;

        for (int i = 0; i < gain.length; i++) {
            currentAltitude += gain[i];
            if (currentAltitude > max) {
                max = currentAltitude;
            }
        }

        return max;
    }
}
