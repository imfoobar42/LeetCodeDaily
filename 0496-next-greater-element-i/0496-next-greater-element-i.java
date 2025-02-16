class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    int n = nums1.length;
    int[] res = new int[n];
    for(int i=0;i<n;i++){
      int index = -1;
      res[i]=-1;
      for(int j=0;j<nums2.length;j++){
      if(nums2[j]==nums1[i]){
        index = j; //index where j was found 
        break;
      }
      }
      if(index!=-1){
      for(int k = index+1;k<nums2.length;k++){
        if(nums1[i]<nums2[k]) {
          res[i]=nums2[k];
        break;
        }
      }
    }
      }
    return res;
    }
    }