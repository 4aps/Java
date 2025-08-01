import java.util.Scanner;

public class PerfectNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num = sc.nextInt();

        if(num % 2 != 0){
            System.out.println(num +" is not a perfect number.");
            return;
        }

        int i = 2;
        int ans = 1;
        while(i <= num/2){
            if(num % i == 0){
                ans += i;
            }
            i++;
        }
        if(ans == num){
            System.out.println(num +" is a Perfect Number.");
        }
        else {
            System.out.println(num +" is not a perfect number.");
        }
    }
}
