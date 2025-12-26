class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum = 0;
        for(int num:apple) sum+=num; //get the sum
        Arrays.sort(capacity); //sorts the array
        int count = 0;
        //either sum is satisfied or capacity finishes
        int m = capacity.length;
        for(int i=m-1;i>=0 && sum>0;i--){
          sum -=capacity[i]; //keep distributing the apples
          count++;
          if(sum==0) break; //when all apples are distributed
        }
        return count;
    }
}