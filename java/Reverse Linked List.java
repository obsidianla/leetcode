public ListNode reverseList(ListNode head) {
        
        ListNode dummy = new ListNode(0);
        
        while (head != null) {
            
            ListNode temp = head.next;
            
            head.next = dummy.next;
            
            dummy.next = head;
            
            head = temp;
            
        }
        
        return dummy.next;   
        
    }
