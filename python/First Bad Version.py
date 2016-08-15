def firstBadVersion(self, n):
        """
        :type n: int
        :rtype: int
        """
        left = 1
        right = n
        while left<=right:
            
            mid = left + (right-left)/2
            
            if isBadVersion(mid):
                right = mid-1
            else:
                left = mid+1
        return left