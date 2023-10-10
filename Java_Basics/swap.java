import java.util.Scanner;

public class swap {
    static void swapUsingTemp(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("The swapped value of a is: "+ a);
        System.out.println("The swapped value of b is: "+ b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter value of b: ");
        int b = sc.nextInt();
        swapUsingTemp(a, b);
    }
}
