int minimumTotal(vector<vector<int>>& triangle) {
        
        
        if (triangle.empty()) return -1;
        
        
        int l1 = triangle.size()-1;
        
        for(int i=l1-1;i>=0;i--) {
            
            for(int j = 0; j<=i;j++) {
                
                triangle[i][j] += min(triangle[i+1][j], triangle[i+1][j+1]); 
                
                
            }
            
        }
        
        return triangle[0][0];
        
        
    }
