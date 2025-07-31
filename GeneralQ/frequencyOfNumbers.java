import java.util.Scanner;

public class frequencyOfNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = sc.nextInt();

        int[] arr = new int[10];

        while (num != 0){
            int rem = num % 10;
            arr[rem]++;
            num /= 10;
        }

        int i = 0;
        System.out.println("Number    |    Frequency");
        while(i < 10){
            if(arr[i] != 0)
                System.out.println("   " + i + "      |      " + arr[i]);
            i++;
        }
    }
}
