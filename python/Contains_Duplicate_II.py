class Solution(object):
    def containsNearbyDuplicate(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: bool
        """
        if len(nums) == 0:
            return False
        map = {}
        for i in range(len(nums)):
            if map.get(nums[i]) == None:
                map[nums[i]] = i
            elif i - map[nums[i]] <= k:
                return True
            else: 
                map[nums[i]] = i
        return False
## The trick is that when you find the nums[j] which is equal to nums[i], 
## the index stored in dict is still the index of num[i]
