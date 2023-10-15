package LinkedList;

public class basicLL {

    public static void displayList(Node Head){
        Node temp = Head;
        while (temp != null){
            System.out.print(temp.data + "  ");
            temp = temp.next;
        }
    }

    public static void displayLListRecur(Node Head){
        if(Head == null) return;
        System.out.print(Head.data + "  "); //for seq LL
        displayLListRecur(Head.next);
    }

    public static void displayReverseLListRecur(Node Head){
        if(Head == null) return;
        displayReverseLListRecur(Head.next);
        System.out.print(Head.data + "  "); // for reverse LL
    }

    public static void insertAtEnd(Node Head, int value){
        Node temp = new Node(value);
        Node t = Head;
        while(t.next != null){
            t = t.next;
        }
        t.next = temp;
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(15);
        Node c = new Node(2);
        Node d = new Node(23);
        Node e = new Node(3);
        Node f = new Node(34);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
//        System.out.println(a.data);
//        System.out.println(b.data);
//        System.out.println(c.data);
//        System.out.println(b.next.data);

        displayList(a);
        System.out.println();
        displayLListRecur(a);
        System.out.println();
        displayReverseLListRecur(a);

        insertAtEnd(a, 89);
        System.out.println();
        displayList(a);
    }
}
