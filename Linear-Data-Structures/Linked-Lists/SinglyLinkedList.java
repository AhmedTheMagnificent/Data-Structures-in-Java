class Node{
    int value;
    Node next;

    Node(int val){
        this.value = val;
        this.next = null;
    }
}

public class SinglyLinkedList{
    Node head;

    public SinglyLinkedList() {
        head = null;
    }

    

    public void insertAtBeginning(int val){
        Node newnNode = new Node(val);
        if(head == null){
            head = newnNode;
        }
        else{
            newnNode.next = head;
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

    public void reverse(){
        Node prev = null;
        Node next = null;
        Node curr = head;
        
    }

    public void display(){
        for(Node temp = head; temp != null; temp = temp.next){
            System.out.print(temp.value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SinglyLinkedList L1 = new SinglyLinkedList();
        L1.insertAtEnd(1000);
        L1.insertAtBeginning(1);
        L1.insertAtBeginning(4);
        L1.insertAtBeginning(5);
        L1.insertAtBeginning(6);
        L1.insertAtBeginning(7);
        L1.insertAtEnd(2);
        L1.display();
        L1.insertAtEnd(3);
        L1.insertAtEnd(4);
        // L1.insertAt(4, 99);
        // L1.insertAt(8, 1000);
        L1.display();
        // L1.reverse();
        L1.display();
    }

}