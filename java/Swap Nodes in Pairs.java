public ListNode swapPairs(ListNode head) {
        
        if(head == null) return head;
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        // we need to find the pre node first
        head = dummy;
        
        while(head.next != null && head.next.next != null) {
            //  swith pre and cur
            ListNode pre = head.next;
            ListNode cur = head.next.next;
            head.next = cur;
            pre.next = cur.next;
            cur.next = pre;
            
            head = pre;
            
        }
        return dummy.next;
        
    }
