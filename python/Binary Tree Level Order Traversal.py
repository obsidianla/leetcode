def levelOrder(self, root):
        """
        :type root: TreeNode
        :rtype: List[List[int]]
        """
        
        result = []
        if root is None:
            return result;
        que = [root]
        
        while len(que) != 0:
            level = []
            size = len(que)
            for i in range(size):
                node = que.pop(0)
                level.append(node.val)
                if node.left:
                    que.append(node.left)
                if node.right:
                    que.append(node.right)
            result.append(level)
        return result
