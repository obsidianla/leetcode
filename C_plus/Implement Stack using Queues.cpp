public:

    queue<int> q1 ;
    queue<int> q2 ;
    

    // Push element x onto stack.
    void push(int x) {
        
        q2.push(x);
        
        while(!q1.empty()) {
            
            int value = q1.front();
            
            q1.pop();
            
            q2.push(value);
            
        }
        
        queue<int> tmp = q1;
        q1 = q2;
        q2 = tmp;
         
    }

    // Removes the element on top of the stack.
    void pop() {
        
        q1.pop();
        
    }

    // Get the top element.
    int top() {
        
        return q1.front();
        
    }

    // Return whether the stack is empty.
    bool empty() {
        
        return q1.empty();
        
    }
