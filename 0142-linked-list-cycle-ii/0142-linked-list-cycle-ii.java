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
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null) return null;
    
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast!=null && fast.next!=null)
        {
            fast = fast.next.next;
            slow = slow.next;
            
            if(slow == fast) break;
        }
        if(slow!=fast) return null;
        
        if(head == slow) return head;
        
        while(head!=slow)
        {
            slow = slow.next;
            head = head.next;
           if(slow == head) return head;
        }
        
        
        return null;
            
        
    }
}