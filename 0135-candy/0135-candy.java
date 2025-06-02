class Solution {

    public int candy(int[] ratings) {
        if (ratings.length == 0)
            return 0;
        
        int size = ratings.length; 
        int[] candies = new int[size]; 
        for (int i = 0; i < size; i++) {
            candies[i] = 1;
        }
        for (int i = 1; i < size; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = 1 + candies[i - 1];
            }
        }
        for (int i = size - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1] && candies[i] <= candies[i + 1]) {
                candies[i] = 1 + candies[i + 1];
            }
        }

        int totalCandies = 0;
        for (int candyCount : candies) {
            totalCandies += candyCount;
        }

        return totalCandies; 
    }
}