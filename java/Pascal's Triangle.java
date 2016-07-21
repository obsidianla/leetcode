public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(numRows < 1) return result;
        List<Integer> pre = new ArrayList<Integer>();
        pre.add(1);
        result.add(pre);
        for ( int i = 2; i <= numRows; i++){
            List<Integer> cur = new ArrayList<Integer>();
            cur.add(1);
            for(int j = 1; j<i-1;j++){
                cur.add(pre.get(j-1)+pre.get(j));
            }
            cur.add(1);
            result.add(cur);
            pre = cur;
        }
        return result;
        
        
    }
