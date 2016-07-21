//Method 1, convert int to string, extra space

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
// Method 2, without extra space

public boolean isPalindrome(int x) {
        
        if(x < 0) return false;
        if(x>=0 && x<10) return true;
        int num = 1;
        int y = x;
        while(y>=10) {
            y = y/10;
            num *=10;
        }
        
        while (x != 0) {
            int left = x /num;
            int right = x%10;
            if(left != right) {
                return false;
            }
            x = (x%num)/10;
            
            num = num/100;
            
        }
        return true;
    }
