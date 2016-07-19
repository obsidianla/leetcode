private int getNumber(int n) {
        //String num = String.valueOf(n);
        int sum = 0;
        
        while(n !=0){
            
            sum += (n%10)*(n%10);
            n = n/10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        HashSet<Integer> m = new HashSet<Integer>();
        
        while (n!=1){
            if(m.contains(n)){
                return false;
            }    
            m.add(n);
            n = getNumber(n);
            
        }
        return true;
        
    }
