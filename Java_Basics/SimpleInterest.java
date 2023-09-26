import java.util.Scanner;

public class SimpleInterest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle amt:");
        float P = sc.nextFloat();
        System.out.println("Enter Rate:");
        float R = sc.nextFloat();
        System.out.println("Enter Time:");
        float T = sc.nextFloat();
        float SI=(P*R*T)/100;
        System.out.println("Simple Interest is:" +SI);
    }
}