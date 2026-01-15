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
    public void reorderList(ListNode head) {
        if ( head == null){
            return;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        fast = slow.next;
        slow.next = null;
        ListNode reverse = null;
        
        while(fast != null){//rverse it 
            ListNode next = fast.next;
            fast.next = reverse;
            reverse = fast;
            fast = next;
        }
        while(reverse !=null){//put reverse and head in one place
            if(reverse.next != null&& head.next !=null){
                ListNode next = reverse.next;
                reverse.next = head.next;
                head.next = reverse;
                reverse = next;
                head = head.next.next;
            }
            else{
                reverse.next = head.next;
                head.next = reverse;
                break;
                
            }
        }
    }
}