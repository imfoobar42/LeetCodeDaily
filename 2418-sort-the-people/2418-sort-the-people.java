class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String> map = new HashMap<>();
        for(int i=0; i<names.length;i++){
          map.put(heights[i],names[i]);
        }
      Arrays.sort(heights);
      int k=0;
      for(int j=heights.length-1;j>=0;j--){
          names[k++] = map.get(heights[j]);
        }
      return names;
    }
}