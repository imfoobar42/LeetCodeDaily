class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        if(len==1) return new int[]{0};
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[len];

        for(int i=0;i<len;i++){
          while(!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()]){
            int prevIndex = stack.pop();
            result[prevIndex] = i-prevIndex;
          }
          stack.push(i);
        }
        return result;
    }
}