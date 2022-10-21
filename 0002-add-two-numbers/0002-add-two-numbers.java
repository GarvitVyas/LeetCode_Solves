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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;
        int carry=0;
        ListNode dummy = new ListNode(0), tail = dummy;
        while(!(l1==null && l2==null && carry==0))
        {   
            int num1 = l1!=null ? l1.val : 0;
            int num2 = l2!=null ? l2.val : 0;
            int add = num1+num2+carry;
            carry = add/10;
            
            ListNode newnode = new ListNode(add%10);
            
            tail.next = newnode;
            tail = newnode;
            
            if(l1!=null) {
                l1 = l1.next;
            }
            if(l2!=null)
            {
                l2 = l2.next;
            }
           
        }
        return dummy.next;
    }
}