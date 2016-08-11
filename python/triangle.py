def minimumTotal(self, triangle):
        """
        :type triangle: List[List[int]]
        :rtype: int
        """
        if len(triangle) == 0:
            return -1
        if len(triangle) == 1:
            return triangle[0][0]
        
        l = len(triangle)-1
        
        for i in range(l)[::-1]:
            for j in range(i+1):
                triangle[i][j] += min(triangle[i+1][j],triangle[i+1][j+1])
        
        return triangle[0][0]
