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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0) return head;
        ListNode tail = head;
        int count = 1;
        while(tail.next != null) 
        {
            tail = tail.next;
            count++;
        }
        tail.next = head;
        
        ListNode curr = head, prev = tail;
        int rotations = count - (k%count);
        while(rotations-- > 0) 
        {
            prev = curr;
            curr = curr.next;
        }
        
        prev.next = null;
        
        return curr;

      
    }
}