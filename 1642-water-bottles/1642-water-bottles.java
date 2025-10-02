class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int res =numBottles;
        int emptyBottle = numBottles;
        while(emptyBottle>=numExchange){
          int newBottles = emptyBottle/numExchange;
          res+=newBottles;
          emptyBottle =emptyBottle%numExchange +newBottles;
        }
        return res;
    }
}