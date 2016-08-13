def reverseBetween(self, head, m, n):
        """
        :type head: ListNode
        :type m: int
        :type n: int
        :rtype: ListNode
        """
        
        if head == None or head.next == None:
            return head
        
        dummy = ListNode(0)
        dummy.next = head
        head1 = dummy
        
        for i in range(m-1):
            head1=head1.next
            
        p = head1.next   
        for j in range(n-m):
            tmp = head1.next
            head1.next = p.next
            p.next = p.next.next
            head1.next.next = tmp
        return dummy.next
        
