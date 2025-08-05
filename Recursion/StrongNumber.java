import java.util.Scanner;

public class StrongNumber {

    static int sum = 0;
    static int factorial(int num){
        if(num <= 1)
            return 1;
        return num * factorial(num - 1);
    }
    static int isItStrong(int num){
        if(num == 0){
            return 0;
        }
        isItStrong(num / 10);
        sum += factorial(num % 10);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int ans = isItStrong(num);
        if(ans == num){
            System.out.println("It is a strong number.");
        }
        else {
            System.out.println("It is not a strong number.");
        }
        sc.close();
    }
}
