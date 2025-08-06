import java.util.Scanner;

public class ProductOfDigitToDigit {

    static int sum = 0;
    static int productOfDigit(int num1, int num2){

        if(num1 == 0 && num2 == 0){
            return sum;
        }
        sum += (num1 % 10) * (num2 % 10);
        return productOfDigit(num1/10, num2/10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int ans = productOfDigit(num1, num2);
        System.out.println("Ans: " + ans);;
        sc.close();
    }
}
