def getRow(self, rowIndex):
        """
        :type rowIndex: int
        :rtype: List[int]
        """
        res = []
        if rowIndex <0:
            return res
        res.append(1)
        for i in range(1,rowIndex+1):
            for j in range(len(res)-1)[::-1]:
                res[j+1]=res[j+1]+res[j]
            res.append(1)
        return res
