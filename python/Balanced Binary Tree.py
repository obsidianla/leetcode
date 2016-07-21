def isBalanced(self, root):
        """
        :type root: TreeNode
        :rtype: bool
        """
        
        if root is None:
            return True
        if root.left is None and root.right is None:
            return True
        if(abs(self.depth(root.left) - self.depth(root.right)) > 1):
            return False
        return self.isBalanced(root.left) and self.isBalanced(root.right)
        
    def depth(self, node):
        if node is None:
            return 0
        return  1+max(self.depth(node.left), self.depth(node.right))   
