class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        List<String> res = new ArrayList<>();
        for(String currentFolder:folder){
          if(
            res.isEmpty() || !currentFolder.startsWith(res.get(res.size()-1)+"/")
            ){
              res.add(currentFolder);
            }
            //add to result only when current res is empty 
            //it is not a subFolder 
        }
        return res;
    }
}