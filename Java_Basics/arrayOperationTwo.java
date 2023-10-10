import java.util.Scanner;

public class arrayOperationTwo {
    static void swapInArray(int[] arr, int i, int j){
        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
    }
    static void reverseArray(int[] arr, int i, int j){
        while(i < j){
            swapInArray(arr, i , j);
            i++;
            j--;
        }
    }

    static void rotateInPlace(int[] arr, int k){
        int n = arr.length;
        k = k % n;
        reverseArray(arr, 0, n-k-1);
        reverseArray(arr, n-k, n-1);
        reverseArray(arr, 0, n-1);
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
        System.out.print("Enter the number of times you want to rotate: ");
        int k = sc.nextInt();
        rotateInPlace(arr, k);
        System.out.print("The rotated array is: ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] +"  ");
        }
    }
}
