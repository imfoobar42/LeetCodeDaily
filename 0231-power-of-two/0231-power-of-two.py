class Solution:
    def isPowerOfTwo(self, n: int) -> bool:
        if n <= 0:  # base
            return True
        if(n & (n - 1) == 0):
          return True
        return False
