import java.awt.*;
import java.util.HashMap;
import java.util.Scanner;

public class FreqOfDigitCountHashMap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();
        while(num != 0){
            int digit = num % 10;

            if(map.get(digit) == null){
                map.put(digit, 1);
            }
            else {
                int count = map.get(digit);
                count++;
                map.put(digit, count);
            }
            num /= 10;
        }

        System.out.println("Frequency of Digits: "+ map);
    }
}
