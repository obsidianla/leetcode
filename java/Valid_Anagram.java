public class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()) return false;
        
        HashMap<Character, Integer> hash = new HashMap<Character, Integer>();
        
        for (int i = 0; i < s.length();i++) {
            
            char c1 = s.charAt(i);
            
            if(hash.containsKey(c1)) {
                hash.put(c1, hash.get(c1)+1); 
            }
            else{
                hash.put(c1,1);
            }
            
        }
        
        for (int j = 0; j < t.length();j++) {
            
            char c2 = t.charAt(j);
            
            if(hash.containsKey(c2) && hash.get(c2) > 0) {
                hash.put(c2, hash.get(c2)-1); 
            }
            else{
                return false;
            }
        
        }
        
        
        for (Integer it: hash.values()){
            if(it != 0){
                return false;
            }
        }
        return true;
    }
}
