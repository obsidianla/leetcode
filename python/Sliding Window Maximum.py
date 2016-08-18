# method 1, naive, scan the list, find the max for each window

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
        
# method 2, use deque

def maxSlidingWindow(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: List[int]
        """
        
        res = []
        
        dq = collections.deque()
        
        for i in range(len(nums)):
            #push the index max of sublist(k) into dq
            while dq and nums[dq[-1]] <= nums[i]:
                dq.pop()
            dq.append(i)
            
            # pop the left number since slide the window
            if dq[0] == i -k:
                dq.popleft()
            # append the max to the result
            if i>=k-1:
                res.append(nums[dq[0]])
        return res
