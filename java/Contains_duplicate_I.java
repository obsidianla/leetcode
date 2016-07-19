public boolean containsDuplicate(int[] nums) {
        if(nums==null || nums.length==0)
        return false;
 
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i: nums){
        
            if(!set.add(i)){
                return true;
            }
        }
 
        return false;
    }
//boolean add(Object o)
//Adds the specified element to this set if it is not already present.
