class Solution {
  public List<String> buildArray(int[] target, int n) {
        String oPush = "Push";
        String oPop = "Pop";
        List<String> res  = new ArrayList<>();
        //array from [1,...n]
        int len = target.length;
        int j=0;
        int i=1;
        while(j<len && i<=n){
          if(target[j]!=i){
            res.add(oPush);
            res.add(oPop);
          }
          else{
            res.add(oPush);
            j++; //increment j only when it matches 
           }
          i++;
        }
        return res;        
    }
}