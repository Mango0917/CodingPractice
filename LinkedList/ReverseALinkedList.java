/*
Reverse a singly linked list.
*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode newhead=null;
        while(head!=null){
            ListNode next=head.next;
            head.next=newhead;
            newhead=head;
            head=next;
        }
        
        return newhead;
    }
}