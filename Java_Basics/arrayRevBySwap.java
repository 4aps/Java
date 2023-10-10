import java.util.Scanner;

public class arrayRevBySwap {

    static void swapInArray(int[] arr, int i, int j){
        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
    }
    static void reverseArray(int[] arr){
        int i = 0, j = arr.length-1;
        while(i < j){
            swapInArray(arr, i , j);
            i++;
            j--;
        }
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
        reverseArray(arr);
        System.out.print("The reversed array is: ");
        for (int i = 0; i < n; i++){
            System.out.print(arr[i]+ "  ");
        }
    }
}
