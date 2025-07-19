class Solution {
    public String[] reorderLogFiles(String[] logs) {
        //create a comparator class
        Comparator<String> myComparison = new Comparator<String>() {
          //over ride compare method
          @Override
          public int compare(String s1, String s2){
            String[] split1 = s1.split(" ",2); //split into 2 parts
            String[] split2 = s2.split(" ",2);

            //compare only letter logs 
            //check if first character is letter or digit
            boolean isDigit1 = Character.isDigit(split1[1].charAt(0)); 
            boolean isDigit2 = Character.isDigit(split2[1].charAt(0));

            //both are letters 
            if(!isDigit1 && !isDigit2){
              int comparison = split1[1].compareTo(split2[1]); //compareStrings
              if(comparison==0) return split1[0].compareTo(split2[0]);
              else return comparison;
            }
            else if(isDigit1 && isDigit2){ //both are digits
              return 0;
            }
            else if(isDigit1 && !isDigit2){
              //second is letter, give priority to letter-log
            return 1;
            }
            else return -1; //first is letter log and second is digit 
          }
        };
        Arrays.sort(logs,myComparison);
        return logs;
    }
}