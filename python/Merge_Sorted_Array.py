class Solution(object):
    def merge(self, nums1, m, nums2, n):
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: void Do not return anything, modify nums1 in-place instead.
        """
        end, i, j = m+n-1, m-1,n-1
        while i>=0 and j>=0:
            if nums1[i] >= nums2[j]:
                nums1[end]=nums1[i]
                end -=1
                i -=1
            else:
                nums1[end]=nums2[j]
                end -=1
                j -=1
        while j>=0:
            nums1[end]=nums2[j]
            end -=1
            j -=1
## merge from the end 
