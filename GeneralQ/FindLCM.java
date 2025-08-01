import java.util.Scanner;

public class FindLCM {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int first = sc.nextInt();
        int second = sc.nextInt();

        int a = first;
        int b = second;

        if(first > second){
            int temp = first;
            first = second;
            second = temp;
        }

        int num = first;
        while(num >= 1){
            num = second % first;
            second = first;
            first = num;
        }

        int LCM = (a/second)*b;
        System.out.println(LCM);
    }
}
