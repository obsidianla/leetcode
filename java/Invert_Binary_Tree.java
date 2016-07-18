// non-recursive
// using queue, first inverse front.left and front.right, then inverse front.left.left and front.left.right
// and inverse front.right.left and front.right.right, then got it!
 public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        // Queue is an interface and can not be instantiated.
        Queue<TreeNode> qu = new LinkedList<TreeNode>();
        qu.add(root);
        // using isEmpty() to test whether it is empty
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
