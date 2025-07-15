class Solution {
    public boolean isValid(String word) {
        //3 characters 
        //english letter and digits - no special characters 
        //atleast one vowel 
        //atleast one consonant
        int n = word.length();
        int consonant = 0;
        int vowel = 0;
        if(n<3) return false;
        for(int i=0;i<n;i++){
          char ch = word.charAt(i);
          if(Character.isLetter(ch)){
            ch = Character.toLowerCase(ch);
            if(ch=='a'|| ch=='e' || ch=='i' || ch=='o'|| ch=='u') vowel++;
            else consonant++;
          }
          else if(!Character.isDigit(ch)) return false;
        }
        return vowel>=1 && consonant>=1;
    }
}