package LinkedLists;

class MyLinkedList {

    Node head; //head of LL
    
    public class Node {
        int val; //value of current node
        Node next; //pointer to next node

        Node (int val){
            this.val = val;
        }
    }

    public MyLinkedList() {
    }
    
    // public int get(int index) {
    //     Node current;
    //     Node temp = current;
    // }
    
    public void addAtHead(int val) {
        this.head = new Node(val);
    }
    
    public void addAtTail(int val) {
        
    }
    
    public void addAtIndex(int index, int val) {
        
    }
    
    public void deleteAtIndex(int index) {
        
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */