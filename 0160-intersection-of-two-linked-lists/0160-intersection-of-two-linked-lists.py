# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def getIntersectionNode(self, headA, headB):
        """
        :type head1, head1: ListNode
        :rtype: ListNode
        """
        map = dict()
        first = headA
        second = headB
        while first:
          map[first]=1 
          first=first.next
        while second:
          if second in map:
            return second
          second=second.next
          
        return None
