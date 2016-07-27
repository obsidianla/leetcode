def binaryTreePaths(self, root):
        
        result = []
        
        if root is None:
            return result
        self.helper(root,result,str(root.val))
        
        return result
        
    def helper(self, root, result,res):
        if root is None:
            return
        if root.left is None and root.right is None:
            result.append(res)
            return
        if root.left is not None:
            self.helper(root.left, result, res+'->'+str(root.left.val))
        if root.right is not None:
            self.helper(root.right, result, res+'->'+str(root.right.val))
