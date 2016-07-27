//Methode 1

//push: O(1)，pop: O(n)，top: O(n)

private Queue<Integer> q = new LinkedList<Integer>();
    
    // Push element x onto stack.
    public void push(int x) {
        q.offer(x);
    }

    // Removes the element on top of the stack.
    public void pop() {
        int size = q.size();
        for(int i = 1; i<size;i++){
            q.offer(q.poll());
        }
        q.poll();
    }

    // Get the top element.
    public int top() {
        int size = q.size();
        for(int i = 1; i<size;i++){
            q.offer(q.poll());
        }
        int value = q.peek();
        q.offer(q.poll());
        
        return value;
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return q.isEmpty();
    }
// method 2
//push: O(n)，pop: O(1)，top: O(1)
private Queue<Integer> q1 = new LinkedList<Integer>();
    private Queue<Integer> q2 = new LinkedList<Integer>();
    
    // Push element x onto stack.
    public void push(int x) {
        
        q2.offer(x);
        
        while(!q1.isEmpty()) {
            q2.offer(q1.poll());
        }
        
        Queue tmp = q1;
        q1 = q2;
        q2 = tmp;
        
    }

    // Removes the element on top of the stack.
    public void pop() {
        
        q1.poll();
    }

    // Get the top element.
    public int top() {
        return q1.peek();
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return q1.isEmpty();
    }
