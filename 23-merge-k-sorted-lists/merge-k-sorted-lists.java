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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0)
            return null;
        ListNode answer = new ListNode();
        PriorityQueue<ListNode> pq = new PriorityQueue<>(
            (a, b) -> a.val - b.val 
        );
        for(int i = 0; i< lists.length;i++){
            if(lists[i] != null)
            pq.add(lists[i]);
        }
        ListNode abc = answer;
        while(pq.size() >0){
            ListNode small = pq.poll();
            if(small.next != null)
                pq.add(small.next);
            abc.next = small;
            abc = abc.next;
        }
        return answer.next;
    }
}