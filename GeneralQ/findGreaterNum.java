import java.util.Scanner;

public class findGreaterNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A: ");
        int a = sc.nextInt();
        System.out.println("Enter B: ");
        int b = sc.nextInt();
        System.out.println("Enter C: ");
        int c = sc.nextInt();
        System.out.println("Enter D: ");
        int d = sc.nextInt();

        if(a > b){
            if(a > c){
                if(a > d){
                    System.out.println("A is greater.");
                }
                else {
                    System.out.println("D is greater.");
                }
            }
            else{
                if(c > d){
                    System.out.println("C is greater.");
                }
                else{
                    System.out.println("D is greater.");
                }
            }
        }

        else{
            if(b > c){
                if(b > d){
                    System.out.println("B is greater.");
                }
                else {
                    System.out.println("D is greater.");
                }
            }
            else{
                if(c > d){
                    System.out.println("C is greater.");
                }
                else {
                    System.out.println("D is greater.");
                }
            }
        }

        sc.close();
    }
}
