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
