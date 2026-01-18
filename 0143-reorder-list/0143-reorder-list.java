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
    private static ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr = head;


        while(curr != null){
             ListNode temp1 = curr.next;   // store next
             curr.next = prev;             // reverse link
             prev = curr;                  // move prev
            curr = temp1; 

        }

        return prev;
    }

    public void reorderList(ListNode head) {
        
        if(head.next==null || head == null) return;
        
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev=null;
        while(fast != null && fast.next != null){
            prev = slow;
            fast= fast.next.next;
            slow = slow.next;
        }
        prev.next = null;
        ListNode reverse = reverse(slow);
        ListNode temp = head;
        
        while(temp.next != null &&reverse != null){
            ListNode dmy = temp.next;
            temp.next = reverse;
            reverse=reverse.next;
            temp = temp.next;
            temp.next = dmy;
            temp=temp.next;
            
        }
       if(reverse != null) temp.next=reverse;
    }
}