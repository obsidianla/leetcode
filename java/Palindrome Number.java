public boolean isPalindrome(int x) {
        String s = new Integer(x).toString();
        
        int len = s.length();
        
        int l = 0;
        int r = len -1;
        while(l<=r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
