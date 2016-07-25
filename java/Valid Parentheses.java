public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        
        for (int i = 0;i<s.length();i++) {
            if(s.charAt(i) == '(' || s.charAt(i) =='[' ||s.charAt(i) =='{') {
                st.push(s.charAt(i));
            }
            else {
                if (st.empty()) return false;
                if (s.charAt(i) == ')') {
                    char value = st.pop();
                    if(value != '(') {
                        return false;
                    }
                    
                }
                else if (s.charAt(i) == ']') {
                    char value = st.pop();
                    if(value != '[') {
                        return false;
                    }
                    
                }
                else {
                    char value = st.pop();
                    if(value != '{') {
                        return false;
                    }
                    
                }
            }
            
        }
        return st.size()==0;
    }
