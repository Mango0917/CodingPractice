/*
Given a singly linked list, determine if it is a palindrome.
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
    public ListNode root;
    public boolean isPalindrome(ListNode head) {
        root=head;
        return head==null?true:check(head);
    }
    public boolean check(ListNode head){
        boolean flag=true;
        if(head.next!=null){
            flag=check(head.next);
        }
        if(flag && head.val==root.val){
            root=root.next;
            return true;
        }
        return false;
        
    }
}