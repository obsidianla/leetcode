def isHappy(self, n):
        """
        :type n: int
        :rtype: bool
        """
        dic = list()
        while n!=1:
            if n in dic:
                return False
            dic.append(n)
            n = self.getNumber(n)
        return True
        
    def getNumber(self, n):
        sum = 0
        while n != 0:
            sum = sum + (n%10) * (n%10)
            n /= 10 
        return sum
