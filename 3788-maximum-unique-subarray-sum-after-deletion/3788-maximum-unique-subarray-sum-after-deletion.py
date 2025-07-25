class Solution(object):
    def maxSum(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        max_ = max(nums)
        if max_ < 0:
          return max_
        seen = set(num for num in nums if num>0)
        return sum(seen)
        