def maxSlidingWindow(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: List[int]
        """
        
        if len(nums) == 0:
            return []
        res = []
        
        for i in range(len(nums)+1-k):
            res.append(max(nums[i:i+k]))
        return res
