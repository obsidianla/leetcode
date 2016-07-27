## tricky method : map()

def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        return map(s.find,s) == map(t.find,t)
        
        
        
## Method 2

 def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        if len(s) != len(t):
            return False
        
        dic = {}
        
        for i in range(len(s)):
            if dic.has_key(s[i]):
                if dic[s[i]] != t[i]:
                    return False
            else:
                if t[i] in dic.values():
                    return False
                dic[s[i]] = t[i]
                
        return True
