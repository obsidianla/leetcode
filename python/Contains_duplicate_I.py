def containsDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        
        hashset = set()
        
        for item in nums:
            if item in hashset:
                return True
            else:
                hashset.add(item)
        return False   
