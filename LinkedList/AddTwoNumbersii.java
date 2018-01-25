/*
You are given two non-empty linked lists representing two non-negative integers. The most significant digit comes first and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Follow up:
What if you cannot modify the input lists? In other words, reversing the lists is not allowed.

Example:

Input: (7 -> 2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 8 -> 0 -> 7
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null && l2==null)
            return null;
        if(l1==null || l2==null){
            return l1==null?l2:l1;
        }
        Stack<ListNode> result=new Stack<>();
        Stack<ListNode> s1=new Stack<>();
        Stack<ListNode> s2=new Stack<>();
        
        while(l1!=null){
            s1.push(l1);
            l1=l1.next;
        }
        while(l2!=null){
            s2.push(l2);
            l2=l2.next;
        }
        int carrier=0;
        while(!s1.isEmpty() ||!s2.isEmpty()){
            int sum=0;
            if(!s1.isEmpty() && !s2.isEmpty()){
                sum+=s1.pop().val+s2.pop().val;
                
            }
            else if(!s1.isEmpty()){
                sum+=s1.pop().val;
            }
            else{
                sum+=s2.pop().val;
            }
            result.push(new ListNode((sum+carrier)%10));
            carrier=(sum+carrier)/10;
        }
        if(carrier==1){
            result.push(new ListNode(carrier));
        }
        ListNode node=new ListNode(0);
        ListNode dummy=node;
        while(!result.isEmpty()){
            node.next=result.pop();
            node=node.next;
        }
        return dummy.next;
    }
}