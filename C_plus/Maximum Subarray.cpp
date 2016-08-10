int maxSubArray(vector<int>& nums) {
        
        //if (nums.empty()) return 0;
        int cur_sum = nums[0];
        int max_sum = nums[0];
        
        for(int i = 1; i<nums.size(); i++){
            
            if(cur_sum < 0){
                cur_sum = nums[i];
            }
            else {
                cur_sum += nums[i];
            }
            
            max_sum = max(cur_sum,max_sum);
            
            
        }
        
        return max_sum;
