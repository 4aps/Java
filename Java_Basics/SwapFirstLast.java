import java.util.Scanner;

public class SwapFirstLast {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int copy = num;
        int last = copy % 10;
        copy /= 10;
        num = copy;

        int count = 0;
        while(copy != 0){
            copy /= 10;
            count++;
        }

        int divisor =  (int) Math.pow(10, count-1);
        int first = num / divisor;
        int mid = num % divisor;

        int newNum = last * (int) Math.pow(10, count) + mid*10 + first;

        System.out.println(newNum);
    }
}
