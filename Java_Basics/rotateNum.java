import java.util.Scanner;

public class rotateNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number: ");
        int num = sc.nextInt();

        System.out.println("Enter the times to rotate: ");
        int k = sc.nextInt();

        int copy = num;
        int count = 0;
        while(num != 0){
            num /= 10;
            count++;
        }
        if(k > count || k < (-count)){
            k %= count;
        }
        if(k < 0){
            k = count + k;
        }

        num = copy;
        int left = num / (int) Math.pow(10, k);
        int right = num % (int) Math.pow(10, k);
        int updatedNum = left + right * (int) Math.pow(10, count-k);

        System.out.println(updatedNum);
    }
}
