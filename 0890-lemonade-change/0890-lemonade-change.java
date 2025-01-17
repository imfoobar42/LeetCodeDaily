class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fiveCount = 0; // Count of $5 bills
        int tenCount = 0;  // Count of $10 bills
        if(bills[0]==10 || bills[0]==20) return false;
        for (int bill : bills) {
            if (bill == 5) {
                // Increment the count of $5 bills
                fiveCount++;
            } else if (bill == 10) {
                // Give $5 as change for $10
                if (fiveCount > 0) {
                    fiveCount--;
                    tenCount++;
                } else {
                    return false; // Not enough $5 bills for change
                }
            } else { // bill == 20
                // Prioritize giving $10 + $5 as change
                if (tenCount > 0 && fiveCount > 0) {
                    tenCount--;
                    fiveCount--;
                } 
                // Otherwise, give three $5 bills as change
                else if (fiveCount >= 3) {
                    fiveCount -= 3;
                } else {
                    return false; // Not enough change
                }
            }
        }
        return true; // All transactions successful
    }
}
