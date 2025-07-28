import java.util.Scanner;

public class swappedPosition {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of number(1-9): ");
        int size = sc.nextInt();

        if(size < 1  || size > 9){
            System.out.println("Invalid input!!");
            return;
        }

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean[] seen = new boolean[15];
        int pos = 1, ans = 0;

        while(num != 0){
            int rem = num % 10;
            if(seen[rem] || rem == 0 || rem > size){
                System.out.println("Invalid input!!");
                return;
            }
            seen[rem] = true;
            int divisor = 1;

            while(rem != 0){
                divisor *= 10;
                rem--;
            }
            ans += pos * (divisor/10);
            num /= 10;
            pos++;
        }

        System.out.println("The updated number is: "+ ans);
    }
}
