class Solution {
    public boolean lemonadeChange(int[] bills) {
        Map<Integer, Integer> billsMap = new HashMap<>(2);
        if(bills[0]==10 || bills[0]==20) return false;
        billsMap.put(5,0);
        billsMap.put(10,0);

        for(int bill:bills){
          if(bill ==5)  billsMap.put(5,billsMap.get(5)+1);
          else if(bill==10){
              if(billsMap.get(5)>0){
                billsMap.put(5,billsMap.get(5)-1);
                billsMap.put(10,billsMap.get(10)+1);
              }
              else return false; 
            }
            else{
              //for 20$ bill
              if(billsMap.get(10)>0 && billsMap.get(5)>0){
                billsMap.put(10,billsMap.get(10)-1);
                billsMap.put(5,billsMap.get(5)-1);
              }
              else if(billsMap.get(5)>2){
                  billsMap.put(5,billsMap.get(5)-3);
                }
                else return false;
              }
            }
        return true;

        }
    }
