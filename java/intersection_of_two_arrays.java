public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        ArrayList<Integer> res = new ArrayList<Integer>();
        
        for (int i = 0; i < nums1.length; i++) {
            if(map.containsKey(nums1[i])) {
                map.put(nums1[i], map.get(nums1[i]) + 1);
            }
            else {
                map.put(nums1[i], 1);
            }
        }
        
        for (int j = 0; j < nums2.length; j++) {
            if(map.containsKey(nums2[j])) {
                if(map.get(nums2[j]) > 1) {
                    map.put(nums2[j], map.get(nums2[j]) -1);
                }
                else {
                    map.remove(nums2[j]);
                }
                res.add(nums2[j]);
            }
            
        }
        int[] result = new int[res.size()];
        for(int k = 0; k<res.size();k++) {
            result[k] = res.get(k);
        }
        return result;
        
    }
