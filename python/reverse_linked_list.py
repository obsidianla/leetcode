def reverseList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        dummy = ListNode(0)
        
        while head != None :
            tmp = head.next
            head.next = dummy.next
            dummy.next = head
            head = tmp
        return dummy.next
