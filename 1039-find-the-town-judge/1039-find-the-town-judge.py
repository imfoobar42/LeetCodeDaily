class Solution(object):
    def findJudge(self, n, trust):
        """
        :type n: int
        :type trust: List[List[int]]
        :rtype: int
        """
        #1.Node that does not have an outgoing edge (outdegree=0)
        #2. Indegree= N-1
        #Matrix
        # 1[0,1,0]
        # 2[0,0,0]
        # 3[0,1,0]
        #Adjacency Matrix
        adjacency_matrix = [[0 for _ in range(n)] for _ in range(n)]
        
        for t in trust:
            start_node = t[0]
            end_node = t[1]
            adjacency_matrix[start_node - 1][end_node - 1] = 1
        
        for person in range(n):
          outdegree = sum(adjacency_matrix[person]) #row 
          indegree =  sum(col[person] for col in adjacency_matrix)
          if outdegree==0 and indegree==n-1:
            return person+1
        return -1