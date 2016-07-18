// time complexity O(n)
// space complextity O(n)
// using hashSet

public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<Integer>();
        HashSet<Integer> set2 = new HashSet<Integer>();
        for ( int i = 0; i <nums1.length;i++) {
            
            set1.add(nums1[i]);
        }
        for ( int j = 0; j <nums2.length;j++) {
            set2.add(nums2[j]);
        }
        
        Iterator<Integer> it = set1.iterator();
        while(it.hasNext()) {
            int value = it.next();
            if(!set2.contains(value))
                it.remove();
        }
        
        int[] res = new int[set1.size()];
        int i = 0;
        for(int x: set1) {
            res[i++] = x;
        }
        return res;
