public int lengthOfLastWord(String s) {
        
        if (s == null) {
            return 0;
        }
        int len = s.length()-1;
        int count =0;
        for(int i = len ; i >=0;i--) {
            if(s.charAt(i) != ' ') {
                count++;
            }
            if ( s.charAt(i) == ' ' && count != 0){
               return count;
            }
        }
        
        return count;
    }
