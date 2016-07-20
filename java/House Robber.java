public int rob(int[] nums) {
        
        ArrayList<Integer> dp = new ArrayList<Integer>();
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        
        dp.add(nums[0]);
        dp.add(Math.max(nums[0],nums[1]));
        
        for(int i = 2; i < nums.length;i++) {
            
            dp.add(Math.max(dp.get(i-2)+nums[i],dp.get(i-1)));
        }
        
        return dp.get(nums.length-1);
        
    }
