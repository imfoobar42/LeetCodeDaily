class Solution {
    public int[] sortByBits(int[] arr) {
        int n = arr.length;
        Integer[] intArray = new Integer[n];
        for(int i=0;i<n;i++) intArray[i]=arr[i]; //copy to Integer intArray
        //custom sort
        Arrays.sort(
          intArray, 
          (a,b)->{
            int differenceBits = Integer.bitCount(a)-Integer.bitCount(b);
            return differenceBits==0 ? a-b : differenceBits;
          }
        );
        for(int i=0;i<n;i++) arr[i]=intArray[i];
        return arr;
    }
}