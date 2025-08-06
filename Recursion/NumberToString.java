import java.util.Scanner;

public class NumberToString{

    static String result = "";
    static String[] arr = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

    static String numberToString(int num){
        if(num == 0){
            return null;
        }
        numberToString(num / 10);
        result += arr[num % 10] + " ";
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        String ans = numberToString(num);
        System.out.println(ans);
        sc.close();
    }
}
