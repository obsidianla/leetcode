def lengthOfLastWord(self, s):
        """
        :type s: str
        :rtype: int
        """
        l = len(s)
        if l==0:
            return 0;
        temp = s.split();
        if temp == []:
            return 0;
        res = temp[len(temp)-1]  
        
        
        return len(res)
