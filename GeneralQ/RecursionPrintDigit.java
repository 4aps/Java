import java.util.Scanner;

public class RecursionPrintDigit {
    static void printDigit(int num){
        if(num == 0){
            return;
        }
        printDigit(num / 10);
        System.out.println(num % 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        printDigit(num);
    }
}
