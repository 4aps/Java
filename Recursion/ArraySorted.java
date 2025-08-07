import java.util.Scanner;

public class ArraySorted {
    static boolean isArraySorted(int arr[], int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1] && i < arr.length){
            return false;
        }
        return isArraySorted(arr, i+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int size = sc.nextInt();

        System.out.print("Enter elements for an array: ");
        int arr[] = new int[size];
        for (int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(isArraySorted(arr, 0));
    }
}
