import java.util.Scanner;

public class HappyNumber {
    static int sumSquareDigit(int num){
        if(num == 0){
            return 0;
        }
        int digit = num % 10;
        return digit * digit + sumSquareDigit(num/10);
    }
    static boolean checkHappy(int num){
        if(num == 1){
            return true;
        }
        if(num == 4){
            return false;
        }
        int next = sumSquareDigit(num);
        return checkHappy(next);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean ans = checkHappy(num);
        System.out.println(ans);
        sc.close();
    }
}
