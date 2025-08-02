import java.util.Scanner;

public class Factorial {

    static int fact(int num){
        if(num <= 1)
            return 1;
        else
            return num * fact(num-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int ans = fact(num);

        System.out.println(ans);
    }
}
