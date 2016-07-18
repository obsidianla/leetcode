/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 // let node.val = node.next.val, then delete the next node
public class Solution {
    public void deleteNode(ListNode node) {
       node.val = node.next.val;
       node.next = node.next.next;
    }
}
