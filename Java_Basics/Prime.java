

import java.util.*;

public class prime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number:");
        int n= sc.nextInt();
        int i=2, count=0;
        for(;i<n;i++) {
            if (n % i == 0) {
                count++;
                break;
            }
        }
            if(count==0)
                System.out.println("It's a Prime.");
            else
                System.out.println("Not a Prime.");
    }
}
