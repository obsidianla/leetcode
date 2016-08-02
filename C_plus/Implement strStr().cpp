int strStr(string haystack, string needle) {
        
        if(needle.empty()) return 0;
        
        if(haystack.empty()) return -1;
        
        int len_haystack = haystack.size();
        
        int len_needle = needle.size();
        
        for (int i = 0; i <= len_haystack - len_needle; i++ ){
            
            int j = 0;
            
            for(; j < len_needle; j++) {
                
                if(haystack[i+j] != needle[j]) {
                    
                    break;
                    
                }
                
            }
            
            if(j == len_needle) {
                
                return i;
                
            }
            
        }
        
        return -1;
        
    }
