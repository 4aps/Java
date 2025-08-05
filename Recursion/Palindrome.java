import java.util.Scanner;

public class Palindrome {

    static int sum = 0, count = 0;
    static int palindrome(int num){
        if(num == 0){
            return 0;
        }
        palindrome(num /10);
        sum += (num % 10)* (int) Math.pow(10, count++);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int copy = num;

        int ans = palindrome(num);

//        System.out.println(ans);
        if(copy == ans){
            System.out.println("It's a palindrome.");
        }
        else {
            System.out.println("It's not a palindrome.");
        }

        sc.close();
    }
}
