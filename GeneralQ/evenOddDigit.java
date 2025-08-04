import java.util.Arrays;
import java.util.Scanner;

public class evenOddDigit {
    static int[] arr = new int[2];
    static int[] SumOfDigits(int num){
        if(num == 0){
            return null;
        }
        SumOfDigits(num / 10);
        if(num % 2 == 0){
            arr[0]++;
        }
        else{
            arr[1]++;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] result = SumOfDigits(num);
        System.out.println("Even: " + result[0]);
        System.out.println("Odd: " + result[1]);
        System.out.println(Arrays.toString(result));
    }
}
