class MinStack {
    private Node head; 
    public MinStack() {
        
    }
    
    public void push(int val) {
        if(this.head != null){
            Node add = new Node(val, Math.min(val,head.min));
            add.next = head;
            head = add;
        }
        else{
            this.head = new Node(val, val);
        }
    }
    
    public void pop() {
        this.head = head.next;
    }
    
    public int top() {
        return this.head.val;
    }
    
    public int getMin() {
        return head.peak();
    }
    private class Node{
        private int val;
        private int min; 
        private Node next;
        private Node(int val, int min){
            this.val = val;
            this.min = min;
        }
        private int peak(){
            return this.min;
        }
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */