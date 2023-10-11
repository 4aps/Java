import java.util.Scanner;

public class PrefixSum {
    static int[] ArrayPrefixSum(int arr[]){
        int n = arr.length;
        int[] pref = new int[n];
        pref[0] = arr[0];
        for(int i = 1; i < n; i++){
            pref[i] = pref[i-1] + arr[i];
        }
        return pref;
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
        System.out.println("The prefix sum array is: ");
        int[] pref = ArrayPrefixSum(arr);
        for(int i = 0; i < n; i++){
            System.out.print(pref[i] + " ");
        }
    }
}
