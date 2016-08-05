class NumArray(object):
    def __init__(self, nums):
        """
        initialize your data structure here.
        :type nums: List[int]
        """
        size = len(nums)
        self.sums = [0]*(size+1)
        for i in range(size):
            self.sums[i+1] += self.sums[i] + nums[i]
        

    def sumRange(self, i, j):
        """
        sum of elements nums[i..j], inclusive.
        :type i: int
        :type j: int
        :rtype: int
        """
        return self.sums[j+1]-self.sums[i]
