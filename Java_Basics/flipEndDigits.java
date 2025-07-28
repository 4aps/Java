import java.util.Scanner;

public class flipEndDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int copy = num;
        int divisor = 1, last = copy % 10;
        int first = 0;

        while(copy != 0){
            first = copy % 10;
            copy /= 10;
            divisor *= 10;
        }
        divisor /= 10;

        int newNum = num - (first * divisor) - last;
        newNum = last * divisor + (newNum + first);

        System.out.println(newNum);
    }
}
