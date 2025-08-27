import java.util.Scanner;
import java.util.Stack;

public class SortStack {

    public static Stack<Integer> sort(Stack<Integer> St){
        if(St.isEmpty()){
            return St;
        }

        int val = St.pop();
        sort(St);

        insertAtBottom(St, val);

        return St;
    }

    static void insertAtBottom(Stack<Integer> St, int val){
        if(St.isEmpty() || val > St.peek()){
            St.push(val);
            return;
        }

        int top = St.pop();
        insertAtBottom(St, val);

        St.push(top);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();

        st.push(10);
        st.push(30);
        st.push(20);
        st.push(40);

//        System.out.print("Enter number of elements: ");
//        int n = sc.nextInt();
//
//        System.out.println("Enter " + n + " elements:");
//        for(int i = 0; i < n; i++){
//            st.push(sc.nextInt());
//        }

        System.out.println("Original Stack: " + st);

        sort(st);

        System.out.println("Reversed Stack: " + st);

        sc.close();
    }
}
