def countAndSay(self, n):
        """
        :type n: int
        :rtype: str
        """
        
        if n <= 0:
            return None
        
        result = '1'
        i = 1
        
        while i<n:
            sb = ''
            count = 1
            
            for j in range(1,len(result)):
                if result[j]==result[j-1]:
                    count +=1
                else:
                    sb = sb + str(count) + result[j-1]
                    count = 1
            sb = sb + str(count) + result[len(result)-1]
            result = sb
            i +=1
        return result
