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
    
    public ListNode merge(ListNode l1, ListNode l2)
    {
        if(l1==null) return l2;
        if(l2==null) return l1;
       
    
        
        if(l1.val>l2.val)
        {
            ListNode temp = l1;
            l1 = l2;
            l2 = temp;
        }
        
        ListNode res = l1;
        while(l1!=null && l2!=null)
        {
            ListNode tmp = null;
            
            while(l1!=null && l1.val<=l2.val)
            {
                tmp = l1;
                l1 = l1.next;
            }
            
            tmp.next = l2;
        
            ListNode temp = l1;
            l1 = l2;
            l2 = temp;
        }
        return res;
    }
    
    
    public ListNode sortList(ListNode head) {
      //base condition
        if(head==null || head.next==null) return head;
        
        ListNode temp = null;
        ListNode fast = head;
        ListNode slow = head;
        //for finding the middle of the linked list to divide it into subproblems
        while(fast!=null && fast.next!=null)
        {
            temp = slow;
            slow = slow.next;
            fast = fast.next.next;
        } 
         temp.next = null;
 
        
        ListNode list1 = sortList(head);
        //for the first half
        ListNode list2 = sortList(slow);
        // for second half our head will be slow pointer
        //
        //merging the 2 list
        return merge(list1,list2); 
    }
}