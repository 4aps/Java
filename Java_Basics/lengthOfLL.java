package LinkedList;

public class lengthOfLL {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static int lengthOfList(Node Head){
        int count = 0;
        Node temp = Head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static int lengthOfListByRecur(Node Head, int count){
        if(Head == null) return count;
        return lengthOfListByRecur(Head.next, 1 + count);
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

        int length = lengthOfList(a);
        System.out.println("The length of Linked list is: " +length);
        System.out.println();
        int l = lengthOfListByRecur(a, 0);
        System.out.println("The length of Linked list is: " +l);
    }
}
