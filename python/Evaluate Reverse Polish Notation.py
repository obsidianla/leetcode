###  also known as postfix notation,
###  every operator follows all of its operands
###  use a stack to store all operands, if encounter operator, then pop two number



def evalRPN(self, tokens):
        """
        :type tokens: List[str]
        :rtype: int
        """
        stack = []
        
        for i in tokens:
            if i not in ['+', '-', '*','/']:
                stack.append(int(i))
                
            else:
                a = stack.pop()
                b = stack.pop()
                if i == '+':
                    stack.append(a+b)
                if i == '-':
                    stack.append(b-a)
                if i == '*':
                    stack.append(a*b)
                if i == '/':
                    if a*b < 0:
                        stack.append(-((-b)/a))
                    else:      
                        stack.append(b/a)
        return stack.pop()
