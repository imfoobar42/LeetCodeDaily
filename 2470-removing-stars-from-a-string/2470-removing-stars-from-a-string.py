class Solution:
    def removeStars(self, s: str) -> str:
        stack = []
        for char in s: 
            if char != '*':  # if letters, add to stack
                stack.append(char) 
            else:
                if stack: #if * then pop if stack not empty
                    stack.pop() 
        return ''.join(stack)