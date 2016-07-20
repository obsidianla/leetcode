List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        Queue<TreeNode> que = new LinkedList<TreeNode>();
        
        if(root == null) return result;
        que.offer(root);
        
        while(!que.isEmpty()) {
            
            ArrayList<Integer> level = new ArrayList<Integer>();
            int size = que.size();
            
            for(int i = 0; i < size;i++) {
                TreeNode node = que.poll();
                level.add(node.val);
                
                if(node.left != null){
                    que.offer(node.left);
                }
                if(node.right != null){
                    que.offer(node.right);
                }
            }
            
            result.add(0,level);
            
        }
        
        return result;
