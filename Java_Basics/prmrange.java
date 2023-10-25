
import java.util.Scanner;

public class prmrange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1:");
        int n= sc.nextInt();
        System.out.print("Enter num2:");
        int m= sc.nextInt();
        int i, count;
        if(n<2){
            System.out.println("Prime numbers starts from 2--");
            n=2;
        }
        for(;n <= m;n++) {
                count=1;
                i=2;
                for(;i<=n/2;i++){
                    if (n % i == 0) {
                        count++;
                        break;
                }
            }
            if(count==1)
                System.out.println(n);
        }
    }
}
