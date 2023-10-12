import java.util.Scanner;

public class prefixSuffixSum {

    static int totalSum(int[] arr){
        int totalSum = 0;
        for(int i = 0; i < arr.length; i++){
            totalSum += arr[i];
        }
        return totalSum;
    }
    static boolean equalPartitionSum(int arr[]){
        int n = arr.length;
        int totalSum = totalSum(arr);
        int prefSum = 0;
        for(int i = 0; i < n; i++) {
            prefSum += arr[i];
            int sufSum = totalSum - prefSum;
            if (sufSum == prefSum) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to input: ");
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        System.out.print("Enter the elements of array: ");
        for(int i = 1; i <= n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Equal partition is possible: " + equalPartitionSum(arr));
    }
}
