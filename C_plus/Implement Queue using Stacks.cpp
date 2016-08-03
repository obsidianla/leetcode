public:

    stack<int> q1;
    stack<int> q2;
    // Push element x to the back of queue.
    void push(int x) {
        
        if (q1.empty()) {
            
            q1.push(x);
        
        }
        else{
        
            while(!q1.empty()) {
                
                int value = q1.top();
                
                q1.pop();
                
                q2.push(value);
                
            }
            
            q1.push(x);
            
            while(!q2.empty()) {
                
                int value = q2.top();
                
                q2.pop();
                
                q1.push(value);
                
            }
            
        }
        
    }

    // Removes the element from in front of queue.
    void pop(void) {
        
        q1.pop();
        
    }

    // Get the front element.
    int peek(void) {
        
        return q1.top();
        
    }

    // Return whether the queue is empty.
    bool empty(void) {
        
        return q1.empty();
        
    }
