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
    public ListNode reverseList(ListNode head) {
        ListNode answer = new ListNode();
        if(head == null){
            return null;
        }
        answer.val = head.val;
        while(head.next != null){
            answer = new ListNode(head.next.val,answer);
            head = head.next;
            
        }
        return answer;
    }
}