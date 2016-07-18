// non-recursive
 
 public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        
        Queue<TreeNode> qu = new LinkedList<TreeNode>();
        qu.add(root);
        
        while(!qu.isEmpty()) {
            TreeNode front = qu.poll();
            if (front.left != null) 
                qu.add(front.left);
            if (front.right != null) 
                qu.add(front.right);
                TreeNode tmp ;
            tmp = front.left;
            front.left = front.right;
            front.right = tmp;
        }
        
        
        return root;
        
    }
