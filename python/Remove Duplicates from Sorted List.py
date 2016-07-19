def deleteDuplicates(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if head == None or head.next == None:
            return head
        cur = head
        
        while cur.next != None:
            if cur.val == cur.next.val:
                cur.next=cur.next.next
            else:
                cur = cur.next
                
        return head
