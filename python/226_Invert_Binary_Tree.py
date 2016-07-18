## recursive version
class Solution(object):
    def invertTree(self, root):
        """
        :type root: TreeNode
        :rtype: TreeNode
        """
        if root == None: 
            return None
        
        if root.left:
            self.invertTree(root.left)
        if root.right:
            self.invertTree(root.right)
        
        root.left,root.right =root.right, root.left
        
        
        return root;
        
## non recursive, using queue

class Solution(object):
    def invertTree(self, root):
        """
        :type root: TreeNode
        :rtype: TreeNode
        """
        if root == None: 
            return None
        qu = [root]
        
        while qu:
            front = qu.pop(0)
            if front.left:
                qu.append(front.left)
            if front.right:
                qu.append(front.right)
            front.left,front.right =front.right, front.left
        
        
        return root;
