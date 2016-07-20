public boolean hasCycle(ListNode head) {
        
        ListNode fast = head;
        ListNode slow = head;
        if (head == null) return false;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            
            fast = fast.next.next;
            
            if(fast == slow) {
                return true;
            }
        }
        return false;
    }
