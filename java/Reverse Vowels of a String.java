public String reverseVowels(String s) {
        
        int l = s.length();
        
        ArrayList<Character> dic = new ArrayList<Character>();
        
        for(int i = 0; i < l;i++) {
            
            char value = s.charAt(i);
            if(comp(value)) {
                dic.add(value);
            }
        }
        
        char[] arr = s.toCharArray();
        int j = dic.size()-1;
        
        for ( int i = 0; i <l;i++) {
            if(comp(arr[i])) {
                arr[i] = dic.get(j);
                j--;
            }
        }
        
        String res = new String(arr);
        return res;
        
    }
    
    public boolean comp(char c) {
        if(c == 'a' || c == 'e'||c== 'i'||c== 'o'||c == 'u'||c == 'A' || c == 'E'||c== 'I'||c== 'O'||c == 'U') {
            return true;
        }
        return false;
    }
