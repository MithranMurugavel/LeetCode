/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null)
            return null;
        
        ListNode result = new ListNode(0);
        result.next = head;
        ListNode dummy = result;
        while (result.next != null && result.next.next != null) {
            ListNode first = result.next;
            ListNode second = first.next;

            first.next = second.next;
            second.next = first;
            result.next = second;
            result = first;
        }
        return dummy.next;
    }
}