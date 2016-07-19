class Solution(object):
    def romanToInt(self, s):
        """
        :type s: str
        :rtype: int
        """
        l = list()
        
        for item in s:
            if item == 'I':
                l.append(1)
            if item == 'V':
                l.append(5)
            if item == 'X':
                l.append(10)
            if item == 'L':
                l.append(50)
            if item == 'C':
                l.append(100)
            if item == 'D':
                l.append(500)
            if item == 'M':
                l.append(1000)
        length = len(l)
        if(length == 1):
            return l[0]
        Sum = 0
        for i in range(length):
            if(i < length - 1 and l[i] < l[i+1]):
                Sum -= l[i]
            else:
                Sum += l[i]
        return Sum
        
