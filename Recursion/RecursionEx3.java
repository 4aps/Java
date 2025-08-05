import java.util.Scanner;

public class RecursionEx3 {
    static int sum = 0;
    static int SumOfDigits(int num){
        if(num == 0){
            return 0;
        }
        SumOfDigits(num / 10);
        sum += num % 10;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = SumOfDigits(num);
        System.out.println(result);
    }
}
