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
    public ListNode modifiedList(int[] nums, ListNode head) {
        
        Set<Integer> set = new HashSet<>();
        for(int i:nums){
            set.add(i);
        }

        ListNode newnode = new ListNode(0);
        ListNode dummy = newnode;
        while(head != null){

            if(!set.contains(head.val)){
                newnode.next= new ListNode(head.val);
                newnode=newnode.next;
            }
                head=head.next;
        }

        return dummy.next;
    }
}