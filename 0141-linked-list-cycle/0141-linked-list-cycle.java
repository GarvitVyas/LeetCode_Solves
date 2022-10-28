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
import java.util.*;
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next == null) return false;
        
        ListNode fast = head;
        ListNode slow = head;
        
     
      do{
          if(fast==null || fast.next==null)
          {
              return false;
          }
          slow = slow.next;
          fast = fast.next.next;
      } while(slow!=fast);
         return true;
    }
}