import java.util.Scanner;

public class DecimalToBinary {
    static int DecimalToBinaryTurner(int num, int binarySum, int index){
        if(num == 0){
            return binarySum;
        }
        binarySum += (num % 2) * (int) Math.pow(10, index++);
        return DecimalToBinaryTurner(num/2, binarySum, index);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int binarySum = 0, index = 0;

        int binaryVal = DecimalToBinaryTurner(num, binarySum, index);
        System.out.println("Binary value of " + num + " is: " + binaryVal);
        sc.close();
    }
}
