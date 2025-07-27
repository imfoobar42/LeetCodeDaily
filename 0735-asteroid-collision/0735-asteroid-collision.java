class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int num:asteroids){
            while (!stack.isEmpty() && num<0 && stack.peek()>0) {
              //current num is negative
              //element at stack top is equal to current num
              if(Math.abs(num)==stack.peek()) {
                stack.pop();
                num=0; //dont add num
                break;
                }
              //keep eleminating the smaller asteroids  
              if(Math.abs(num)>stack.peek()){
                stack.pop();
                continue;
              }
              //so that we dont add this num
              if(Math.abs(num)< stack.peek()){
                num = 0;
                break;
              }
            }
             if (num!=0)stack.add(num);
        }
        int res[] = new int[stack.size()];
        int k = stack.size()-1;
        while (!stack.isEmpty() && k>=0) {
          res[k--] = stack.pop();
        }
        return res;
    }
}