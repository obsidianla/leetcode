 int countPrimes(int n) {
        if(n <= 1) return 0;
        bool count[n+1];
        
        for( int i = 0; i<=n;i++){
            count[i] = true;
        }
        
        
        for( int i = 2; i<=n;i++){
            
            if(count[i]){
                
                for(int j = 2; i*j <= n;j++){
                    
                    count[i*j] = false;
                    
                }
                
            }
            
        }
        int cnt = 0;
        for( int i = 2; i<n;i++){
            if(count[i]){
                cnt++;
            }
        }
        
        return cnt;
        
    }
