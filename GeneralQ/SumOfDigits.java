import java.util.Scanner;

public class SumOfDigits {
    static void SumOfDigits(int num, int sum){
        if(num == 0){
            System.out.println(sum);
            return;
        }
        SumOfDigits(num / 10, sum + num % 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;
        SumOfDigits(num, sum);
    }
}
