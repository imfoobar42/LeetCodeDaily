class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int res =numBottles;
        int emptyBottle = numBottles;
        while(emptyBottle>=numExchange){
          int newWater = emptyBottle/numExchange;
          res+=newWater;
          emptyBottle =emptyBottle%numExchange +newWater;
        }
        return res;
    }
}