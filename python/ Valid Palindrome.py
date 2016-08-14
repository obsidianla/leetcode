// get rid of non-digit and non-alpha, then turn all to upper, and test


def isPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        if s == ' ':
            return True
        l = len(s)-1
        left = 0
        right = l
        s=s.upper()
        
        while left<=right:
            while left<=right and not s[left].isalpha() and not s[left].isdigit():
                left += 1
            while left<=right and not s[right].isalpha() and not s[right].isdigit():
                right -= 1
            
            if left<=right and s[left] != s[right]:
                return False
            else:
                left += 1
                right -= 1
        return True
