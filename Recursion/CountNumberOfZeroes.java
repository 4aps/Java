import java.util.Scanner;

public class CountNumberOfZeroes {

    static int count = 0;
    static void numberOfZeroes(int num) {
        if(num == 0){
            System.out.println("O appeared " + count + " times.");
            return;
        }
        if(num % 10 == 0){
            count++;
        }
        numberOfZeroes(num / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        numberOfZeroes(num);
        sc.close();
    }
}
