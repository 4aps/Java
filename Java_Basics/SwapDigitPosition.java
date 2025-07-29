import java.util.Scanner;

public class SwapDigitPosition {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int num = sc.nextInt();

        int pos = 0;
        int ans = 0;

        while (num != 0){
            int digit = num % 10;
            pos++;
            ans += pos * (int) Math.pow(10, digit-1);
            num /= 10;
        }

        System.out.println(ans);
    }
}
