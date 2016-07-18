// Method 1, hashmap

public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        int l = nums.length;
        for(int elem:nums){
            if(map.containsKey(elem)){
                map.put(elem, map.get(elem)+1);
            }
            else {
                map.put(elem,1);
            }
        }
        for (int item:map.keySet()){
            if(map.get(item)>l/2){
                return item;
            }
        }
        return -1;
    }
// Method 2
public int majorityElement(int[] nums) {
        int l = nums.length;
        int result = nums[0];
        int count = 0;
        for (int i = 0; i < l; i++) {
            if(result == nums[i] || count == 0) {
                count++;
                result = nums[i];
            } 
            else count--;
        }
        return result;
    }
