class Solution {
    public boolean isValid(String s) {
      Stack<Character> stack = new Stack<>();
      int n= s.length();
      for(char c: s.toCharArray()){
        if(c=='('||c=='{'||c=='[') stack.push(c);
        else{ //closing braces encountered 
        if(stack.isEmpty()) return false; //stack empty and closing braces found
        //check char at the top of the stack
        char top = stack.peek();
        if(c==')' && top=='(' ||
          c==']' && top=='[' ||
          c=='}' && top=='{' 
          ) stack.pop();
          else return false; 
        }
      }
      //still we have few open parentheses left 
      return stack.isEmpty();
    }
}