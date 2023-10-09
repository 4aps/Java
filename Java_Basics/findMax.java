import java.util.Scanner;

import static java.lang.Integer.MIN_VALUE;

public class findMax {
    static int numMax(int arr[]){
        int hold = MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > hold){
                hold = arr[i];
            }
        }
        return hold;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to input: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of array: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The largest number is: "+ numMax(arr));
    }
}
