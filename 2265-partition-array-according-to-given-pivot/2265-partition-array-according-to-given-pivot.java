class Solution {

    public int[] pivotArray(int[] nums, int pivot) {
        int len = nums.length;
        int res[]= new int[len];
        int index = 0;
        for(int n:nums){
          if(n<pivot) res[index++]=n;
        }
        for(int n:nums){
          if(n==pivot) res[index++]=n;
        }
        for(int n:nums){
          if(n>pivot) res[index++]=n;
        }
        return res;
    }
}