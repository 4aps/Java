import java.util.Scanner;

import static java.lang.Math.pow;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any binary number: ");
        int bin = sc.nextInt();
        int hold = bin;
        int dec = 0;
        int p = 1;
        int ans = 0;
        while(bin != 0){
            dec = bin % 10;
            ans += dec * p;
            bin /= 10;
            p *= 2;
        }
        System.out.print("Decimal of "+hold+" is: "+ans);
    }
}
