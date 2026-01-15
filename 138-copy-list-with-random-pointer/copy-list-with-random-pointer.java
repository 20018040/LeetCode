/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        
        HashMap<Node,Node> list = new HashMap<>();
        Node copy = head;
        while(copy != null){
            Node add = new Node(copy.val);
            list.put(copy, add);
            copy = copy.next;
        }
        for (Node key : list.keySet()) {
            list.get(key).next = list.get(key.next);
            list.get(key).random = list.get(key.random);
        }

        return list.get(head);
    }
}