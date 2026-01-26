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
    public ListNode mergeKLists(ListNode[] lists) {
        
        PriorityQueue<ListNode> queue = new PriorityQueue<>((a, b) -> a.val - b.val);


        for(ListNode ls: lists){
            while(ls != null){
                queue.add(ls);
                ls=ls.next;
            }
        }

        ListNode newNode = new ListNode(0);
        ListNode dummy = newNode;
        while(!queue.isEmpty()){
            newNode.next = queue.poll();
            newNode=newNode.next;
        }
        newNode.next = null;
        return dummy.next;
    }
}