class Solution(object):
    def findRestaurant(self, list1, list2):
        """
        :type list1: List[str]
        :type list2: List[str]
        :rtype: List[str]
        """
        # common strings 
        # with minm sum of their indexes 
        # hashmap storing indexes and sum 
        # create a list for result 
        result = []
        minIndex = 2000
        map1= {}
        for index,value in enumerate(list1):
          map1[value]= index

        for index,value in enumerate(list2):
          if value in map1:
            _sum = index + map1[value]
            if(_sum==minIndex):
              result.append(value)
            elif _sum<minIndex:
              result=[]
              result.append(value)
              minIndex = _sum
        return result