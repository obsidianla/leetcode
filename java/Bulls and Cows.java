public String getHint(String secret, String guess) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        StringBuilder res = new StringBuilder();
        
        int count = 0;
        for(int i = 0; i < secret.length();i++){
            if(secret.charAt(i) == guess.charAt(i)){
                count++;
            }
        }
        
        for(int i = 0; i < secret.length();i++){
            
            char value = secret.charAt(i);
            if(map.containsKey(value)) {
                map.put(value, map.get(value)+1);
            }
            else{
                map.put(value, 1);
            }
        }
        
        char[] a  = String.valueOf(count).toCharArray();
        res.append(a);
        res.append('A');
        
        
        int count1 = 0;
        for(int i = 0; i < secret.length();i++){
            
            char value = guess.charAt(i);
            if(map.containsKey(value)) {
                if(map.get(value) > 1) {
                    map.put(value, map.get(value)-1);
                }
                else{
                    map.remove(value);
                }
                count1++;
            }
            
        }
        
        count1 = count1-count;
        char[] b  = String.valueOf(count1).toCharArray();
        res.append(b);
        res.append('B');
        
        return res.toString();
        
    }
