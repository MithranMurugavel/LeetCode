/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode A, ListNode B) {
        
        List<ListNode> list=new ArrayList<>();

        ListNode temp=A;
        while(temp != null){
            list.add(temp);
            temp=temp.next;
        }

         temp=B;

        while(temp != null){
            if(list.contains(temp)){
                return temp;
            }
            temp=temp.next;
        }

        return null;
    }
}