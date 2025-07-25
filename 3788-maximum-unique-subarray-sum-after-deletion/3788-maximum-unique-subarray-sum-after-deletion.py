class Solution(object):
    def maxSum(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        max_ = float('-inf')
        seen = set()
        for num in nums:
          if num > 0:
            seen.add(num)
          if num > max_:
            max_ = num
        if max_ < 0:
          return max_
        return sum(seen)
        