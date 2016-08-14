def __init__(self):
        """
        initialize your data structure here.
        """
        self.st1 =[]
        self.st2 =[]
        

    def push(self, x):
        """
        :type x: int
        :rtype: void
        """
        self.st1.append(x)
        if len(self.st2)==0 or x <= self.st2[-1]:
            self.st2.append(x)
        

    def pop(self):
        """
        :rtype: void
        """
        top = self.st1[-1]
        self.st1.pop()
        if top == self.st2[-1]:
            self.st2.pop()
        

    def top(self):
        """
        :rtype: int
        """
        return self.st1[-1]
        

    def getMin(self):
        """
        :rtype: int
        """
        return self.st2[-1]
