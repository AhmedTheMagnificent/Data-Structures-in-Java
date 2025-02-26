class Node{
    int value;
    Node next;

    Node(int val){
        this.value = val;
        this.next = null;
    }
}

public class SinglyLinedList{
    Node head;

    public SinglyLinedList() {
        head = null;
    }

    

    public void insertAtBeginning(int val){
        Node newnNode = new Node(val);
        if(head == null){
            head = newnNode;
        }
        else{
            newnNode.next = head.next;
            head = newnNode;
        }
    }

    public void insertAtEnd(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
        }
        else{
            Node nodeptr = head;
            while(nodeptr.next != null){
                nodeptr = nodeptr.next;
            }
            nodeptr.next = newNode;
        }

    }

}