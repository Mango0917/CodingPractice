/*
Given a linked list, determine if it has a cycle in it.

Follow up:
Can you solve it without using extra space?
*/
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null) return false;
        ListNode temp=head;
        ListNode temp2=head;
        while(temp2.next!=null && temp2.next.next!=null){
            temp=temp.next;
            temp2=temp2.next.next;
            if(temp==temp2) return true;
        }
        return false;
    }
}