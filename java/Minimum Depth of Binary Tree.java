public int minDepth(TreeNode root) {
        if(root == null) return 0;
        
        if(root.left == null ){
            
            return 1 + minDepth(root.right);
        }
        else if (root.right == null){
            return  minDepth(root.left)+1;
        }
        return Math.min(minDepth(root.left), minDepth(root.right)) +1;
    }
