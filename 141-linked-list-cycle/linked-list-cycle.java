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
    public boolean hasCycle(ListNode head) {
        ArrayList<ListNode> collection = new ArrayList<>();
        if(head == null)
            return false;
        while(head.next != null){
            if(collection.contains(head))
                return true;
            else collection.add(head);
            head = head.next;
        }
        return false;
    }
}