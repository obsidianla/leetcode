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
    
// method 3 
// quicksort, sort the array first, then the item at len/2 should be the result
public int majorityElement(int[] num) {
        int len = num.length;
        quickSort(num,0,len-1);
        return num[len/2];
    }
    public void quickSort(int[] num,int low,int high){
        if (low>=high) return;
        int i=low;
        int j=high;
        int pivot = num[(low+high)/2];
        while (i<=j){
            while (num[j]>pivot){j--;}
            
            while (num[i]<pivot){i++;}
            if(i<=j){
                int tmp = num[i];
                num[i] = num[j];
                num[j] = tmp;
                i++;
                j--;
            }
        }
        if(low < j)
            quickSort(num,low,j);
        if (high >i)
            quickSort(num,i,high);

    }
