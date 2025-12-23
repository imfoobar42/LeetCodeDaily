class Solution {
  public int[] smallerNumbersThanCurrent(int[] nums) {
    //brute force 
    int n = nums.length;
    int count[] = new int[101];
    for (int num : nums)
      count[num]++; //get the count of each element
    for (int i = 1; i < 101; i++) { //prefix count array
      count[i] += count[i - 1];
    }
    int[] res = new int[n];
    for (int i = 0; i < n; i++) {
      if(nums[i]==0) continue; //skip
      res[i]=count[nums[i]-1];
    }
    return res;
  }
  //TC: O(n)
  //SC: O(n)
}