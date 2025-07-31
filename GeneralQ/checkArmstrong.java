import java.util.Scanner;

public class checkArmstrong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int copy = num;
        int digitCounter = 0;

        while(num != 0){
            num /= 10;
            digitCounter++;
        }

        int ans = 0;
        num = copy;

        while (num != 0){
            int rem = num % 10;
            ans += (int) Math.pow(rem, digitCounter);
            num /= 10;
        }

        if(ans == copy){
            System.out.println(copy + " is an Armstrong Number.");
        }
        else{
            System.out.println("Not an Armstrong Number.");
        }

        sc.close();
    }
}
