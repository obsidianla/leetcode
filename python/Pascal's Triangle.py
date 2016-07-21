result=[]
        if numRows <1:
            return result
        pre = [1]
        result.append(pre)
        for i in range(2,numRows+1):
            cur=[1]
            for j in range(1, i-1):
                cur.append(pre[j]+pre[j-1])
            cur.append(1)
            result.append(cur)
            pre=cur
        return result
