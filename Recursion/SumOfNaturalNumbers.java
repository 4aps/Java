import java.util.Scanner;

public class SumOfNaturalNumbers {
    static int sumOfNaturalNum(int num){
        if(num == 0){
            return 0;
        }
        return num + sumOfNaturalNum(num-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = sc.nextInt();

        int ans = sumOfNaturalNum(num);
        System.out.println(ans);
        sc.close();
    }
}
