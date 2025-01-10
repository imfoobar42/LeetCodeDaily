class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
      //creating bMax  
      //maintain the max frequency of letters in set B
      int[] bMax = new int[26]; 
      for(String word : words2){
        int[] countB_i = countArray(word); //get count array for each word in set B
        for(int i=0;i<26;i++){
          bMax[i] = Math.max(countB_i[i],bMax[i]);
        }
      }
      //returning Universal set 
       List<String> universal_set = new ArrayList<>();
      
              
       //check every word from set A
       for(String word:words1){
        if(isUniversal(word,bMax)) universal_set.add(word);
       }
       return universal_set;
    }
    //check if word is universal or not
    public boolean isUniversal(String words,int[] bMax){
        int[] word_count = countArray(words);
        for(int i=0;i<26;i++){
          if(word_count[i]<bMax[i]) 
            return false;
        }
        return true; //word is a universal_word
       }
    //countArray helper function to get frequency of each element in the word
    public int[] countArray(String s){
    int[] giveCount = new int[26];
    for(int i=0;i<s.length();i++){
      giveCount[s.charAt(i)-'a']++;
      }
    return giveCount;


    }
}