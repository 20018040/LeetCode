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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode answer = new ListNode();
        ListNode head = answer;
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                answer.next = new ListNode(list1.val);
                answer = answer.next;
                list1 = list1.next;
            }
            else{
                answer.next = new ListNode(list2.val);
                answer = answer.next;
                list2 = list2.next;
            }
        }
        if(list1 != null){
            answer.next = list1;
        }
        else answer.next = list2;
        
        return head.next;
    }
}