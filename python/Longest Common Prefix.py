def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        result = ''
        
        if len(strs) == 0 :
            return ''
            
        for i in range(len(strs[0])):
            temp = strs[0][i]
            for j in range(1,len(strs)):
                if i+1> len(strs[j]) or temp != strs[j][i]:
                    return result
            result += temp
        return result
