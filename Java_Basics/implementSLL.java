package LinkedList;

public class implementSLL {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class linkedList{
        Node head = null;
        Node tail = null;

        int size = 0;
        void insertAtEnd(int value){
            Node temp = new Node(value);
            if(head == null){
                head = temp;
            }
            else{
                tail.next = temp;
            }
            tail = temp;
            size++;
        }

        void insertAtStart(int value){
            Node temp = new Node(value);
            if(head == null){
                head = tail = temp;
            }
            else{
                temp.next = head;
                head = temp;
            }
            size++;
        }
        void insertAtMid(int index, int value){
            Node t = new Node(value);
            Node temp = head;
            if(index == size()){
                insertAtEnd(value);
                return;
            }
            else if (index == 0) {
                insertAtStart(value);
                return;
            }
            else if (index > size() || index < 0) {
                System.out.println("Wrong Index");
                return;
            }
            for(int i = 1; i < index; i++){
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
            size++;
        }

        int getAt(int index){
            if (index > size() || index < 0) {
                System.out.println("Wrong Index");
                return index;
            }
            Node temp = head;
            for(int i = 1; i <= index; i++){
                temp = temp.next;
            }
            return temp.data;
        }

        void deleteAt(int index){
            Node temp = head;
            if(index == 0){
                head = head.next;
                size--;
                return;
            }
            else if(index > size){
                System.out.println("Wrong Index");
                return;
            }
            for(int i = 1; i < index; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if(index == size - 1) tail = temp;
            size--;
        }
        void displayLL(){
            Node temp = head;
            while (temp != null){
                System.out.print(temp.data + "  ");
                temp = temp.next;
            }
            System.out.println();
        }
        int size(){ //0(n)
            int count = 0;
            Node temp = head;
            while (temp != null){
                count++;
                temp = temp.next;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.insertAtStart(111);
//        ll.displayLL();
        ll.insertAtEnd(5);
//        ll.displayLL();
        ll.insertAtEnd(12);
//        ll.displayLL();
        ll.insertAtStart(44);
//        ll.displayLL();
        ll.insertAtMid(3, 0);
//        ll.displayLL();
        ll.insertAtMid(5, 22);
//        ll.displayLL();
        ll.insertAtMid(0, 100);
//        ll.displayLL();
//        ll.insertAtMid(-66, 100);
//        ll.displayLL();
        int len = ll.size();
//        System.out.println("The length of Linked list is: "+ len);
//        System.out.println(ll.getAt(-99));
//        System.out.println(ll.size);
        ll.deleteAt(16);
        ll.displayLL();
        System.out.println(ll.tail.next);
    }
}
