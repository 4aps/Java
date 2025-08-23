class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CustomLinkedList {
    Node head;
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    public void insertAtAnyPos(int data, int pos){
        Node newNode = new Node(data);
        if(pos == 1){
            newNode.next = head;
            head = newNode;
            return;
        }

        Node prev = null;
        Node curr = head;
        while (pos > 1 && curr != null){
            prev = curr;
            curr = curr.next;
            pos--;
        }
        if(pos == 1){
            newNode.next = curr;
            prev.next = newNode;
        }
    }

    public void deleteAtHead(){
        if (head == null) {
            return;
        }
        head = head.next;
    }

    public void deleteAtTail(){
        if(head == null){
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }

        Node curr = head;
        while (curr.next.next != null){
            curr = curr.next;
        }
        curr.next = null;
    }

    public void deleteAtAnyPos(int pos){
        Node prev = null;
        Node curr = head;

        if(pos == 1){
            deleteAtHead();
            return;
        }

        if(head == null){
            return;
        }
        while(curr != null && pos > 1){
            prev = curr;
            curr = curr.next;
            pos--;
        }
        if(pos == 1){
            prev.next = curr.next;
        }
    }
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(40);
        list.insert(50);
        list.insert(60);
        list.insert(70);
        list.insert(80);
        list.insertAtAnyPos(30, 3);
        list.insert(90);
        list.insertAtAnyPos(100, 1);
        list.display();

        list.deleteAtAnyPos(1);

        list.display();

        list.deleteAtHead();

        list.display();

        list.deleteAtTail();
        list.display();
    }
}
