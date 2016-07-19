def intersect(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: List[int]
        """
        dic = {}
        res = []
        ## dic = dict()
        for item1 in nums1:
            if item1 in dic:
                dic[item1] += 1
            else:
                dic[item1] = 1
        
        for item2 in nums2:
            if item2 in dic:
                if dic[item2] > 1:
                    dic[item2] -= 1
                else:
                    dic.pop(item2)
                res.append(item2)
        return res
