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
        while(reverse !=null){
            ListNode Temp1 = head.next;
            ListNode Temp2 = reverse.next;
            
            reverse.next = head.next;
            head.next = reverse;
            
            head = Temp1;
            reverse = Temp2;
        }
    }
}