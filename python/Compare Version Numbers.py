def compareVersion(self, version1, version2):
        """
        :type version1: str
        :type version2: str
        :rtype: int
        """
        v1 = version1.split('.')
        v2 = version2.split('.')
        
        l = min(len(v1), len(v2))
        
        for i in range(l):
            if int(v1[i])<int(v2[i]):
                return -1
            elif int(v1[i])>int(v2[i]):
                return 1
                
        if len(v1)>len(v2):
            for j in range(i+1, len(v1)):
                if(int(v1[j])>0):
                    return 1
            return 0
        elif len(v1)<len(v2):
            for j in range(i+1, len(v2)):
                if(int(v2[j])>0):
                    return -1
            return 0
        else:
            return 0
            
