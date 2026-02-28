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
        
        ListNode answer = new ListNode();
        PriorityQueue<ListNode> pq = new PriorityQueue<>(
            (a, b) -> a.val - b.val 
        );
        for(int i = 0; i< lists.length;i++){
            if(lists[i] != null)
            pq.add(lists[i]);
        }
        ListNode abc = answer;
        while(pq.peek() != null){
            
            abc.next = pq.poll();
            abc = abc.next;
            if (abc.next != null){
                pq.add(abc.next);
            }
        }
        return answer.next;
    }
}