class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        int i = 0;
        List<Integer> list = new ArrayList<>();
        for(String word:words){
            if(word.indexOf(x)!=-1){
                list.add(i);
            }
            i++;
        }
        return list;
    }
}