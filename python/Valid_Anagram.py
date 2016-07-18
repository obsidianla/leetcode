def isAnagram(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        sl = len(s)
        tl = len(t)
        if sl != tl:
            return False
        arr = [0 for i in range(26)]
        ## in python, use ord to transform character to ASCII
        for i in range(sl):
            arr[ord(s[i]) - ord('a')] += 1 
            
        for j in range(tl):
            arr[ord(t[j]) - ord('a')] -= 1            
        for k in arr:
            if k != 0:
                return False
        return True
