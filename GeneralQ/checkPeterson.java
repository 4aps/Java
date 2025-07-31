import java.util.Scanner;

public class checkPeterson {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int rem, fact;
        int copy = num;
        int ans = 0;

        while (num != 0){
            rem = num % 10;
            fact = 1;
            while(rem > 1){
                fact *= rem;
                rem--;
            }
            ans += fact;
            num /= 10;
        }

        System.out.println(ans);
        if(copy == ans){
            System.out.println(copy + " is a Peterson Number.");
        }
        else{
            System.out.println(copy + " is not a Peterson Number.");
        }
        sc.close();
    }
}
