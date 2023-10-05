import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any binary number: ");
        int dec = sc.nextInt();
        int hold = dec;
        int p = 1;
        int ans = 0;
        while(dec > 0){
            int rem = dec % 2;
            ans += rem * p;
            p *= 10;
            dec /= 2;
        }
        System.out.print("Decimal of "+hold+" is: "+ans);
    }
}
