import java.util.Scanner;

public class BinaryToDecimal {

    static int count = 0, decimalSum = 0;
    static void BinaryToDecimalTurner(int num){
        if(num == 0){
            System.out.println("Decimal value: " + decimalSum);
            return;
        }
        decimalSum += (num % 10) * (int) Math.pow(2, count++);
        BinaryToDecimalTurner(num/10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        BinaryToDecimalTurner(num);
        sc.close();
    }
}
