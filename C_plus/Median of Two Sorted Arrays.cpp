double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        
        vector<int> res;
        int l1 = nums1.size();
        int l2 = nums2.size();
        if(nums1.empty()&&nums2.empty()){
            return -1;
        }
        if(nums1.empty() && !nums2.empty()){
            
            if(l2%2 == 1){
                return nums2[l2/2];
            }
            else {
                return double(nums2[l2/2]+nums2[l2/2-1])/2;
            }
            
        }
        if(!nums1.empty() && nums2.empty()){
            
            if(l1%2 == 1){
                return nums1[l1/2];
            }
            else {
                return double(nums1[l1/2]+nums1[l1/2-1])/2;
            }
            
        }
        
        
        
        
        int i=0, j=0;
        
        while(i<l1&&j<l2){
            
            if(nums1[i] < nums2[j]){
                
                res.push_back(nums1[i]);
                i++;
            }
            else{
                res.push_back(nums2[j]);
                j++;
            }
            
            
        }
        
        if(i<l1){
            for(;i<l1;i++){
                
                res.push_back(nums1[i]);
            }
            
        }
        
        if(j<l2){
            for(;j<l2;j++){
                
                res.push_back(nums2[j]);
            }
            
        }
        
        
        if((l1+l2)%2==1) return res[(l1+l2)/2];
        else return double(res[(l1+l2)/2]+res[(l1+l2)/2-1])/2;
        
        
        
        
    }
