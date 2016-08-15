def mySqrt(self, x):
        """
        :type x: int
        :rtype: int
        """
        
        if x <= 1:
            return x
        
        left, right = 0, x
        
        while left<=right:
            mid = left+(right-left)/2
            
            if mid == x/mid:
                return mid
            elif mid > x/mid:
                right = mid-1
            else:
                left = mid+1
        return right    
