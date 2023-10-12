import java.util.Scanner;

public class PrefixSumInPlaceRangeSum {
    static int[] ArrayPrefixSum(int arr[]){
        int n = arr.length;
        for(int i = 1; i < n; i++){
            arr[i] += arr[i-1];
        }
        return arr;
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
        System.out.println("The prefix sum array is: ");
        int[] prefSum = ArrayPrefixSum(arr);
        for(int i = 1; i <= n; i++){
            System.out.print(prefSum[i] + " ");
        }
        System.out.println("");
        System.out.println("Enter number of queries: ");
        int q = sc.nextInt();
        while(q-- > 0){
            System.out.println("Enter the range: ");
            int l = sc.nextInt();
            int r = sc.nextInt();

            int ans = prefSum[r] - prefSum[l-1];
            System.out.println("Sum is: " + ans);
        }
    }
}
