# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def sortedArrayToBST(self, nums):
      def buildTree(nums,left,right):
        if left>right:
          return None
        median = (left + right) //2
        node = TreeNode(nums[median])
        node.left = buildTree(nums,left,median-1)
        node.right = buildTree(nums,median+1,right)
        return node
      return buildTree(nums,0,len(nums)-1)
          


