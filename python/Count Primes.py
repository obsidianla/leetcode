#sieve of Eratosthenes


import math

class Solution(object):
    def countPrimes(self, n):
        """
        :type n: int
        :rtype: int
        """
        if n<=2:
            return 0;
        prime=[0]*(n)
        for i in range(2,n):
            prime[i] = 1
        
        for i in range(2,int(math.sqrt(n))+1):
            if prime[i] == 1:
                j=i*i
                while j<n:
                    prime[j]=0
                    j += i
        cnt = 0
        for i in range(n):
            if prime[i]==1:
                cnt += 1
        return cnt
