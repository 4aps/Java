import java.util.Scanner;

public class FindGCD {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int first = sc.nextInt();
        int second = sc.nextInt();

        if(first > second){
            int temp = first;
            first = second;
            second = temp;
        }

        int num = first;
        while(num >= 1){
            if(second % num == 0){
                System.out.println(num);
                return;
            }
            else {
                num = second % first;
                second = first;
                first = num;
            }
        }

        sc.close();
        return;
    }
}
