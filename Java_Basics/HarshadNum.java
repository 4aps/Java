import java.util.Scanner;

public class HarshadNum {
    public static int checkHarshad(int num){

        int ans = 0;
        while(num > 0){
            int rem = num % 10;
            ans += rem;
            num /= 10;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int ans = checkHarshad(num);
        if(num % ans == 0){
            System.out.println("It's a Harshad Number.");
        }
        else {
            System.out.println("It's not a Harshad Number.");
        }
        sc.close();
    }
}
