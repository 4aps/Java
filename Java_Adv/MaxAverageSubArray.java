import java.util.Scanner;

public class MaxAverageSubArray {

    static double findMaxAverage(int[] arr, int keys){
        double maxSum = Integer.MIN_VALUE;
        double sum = 0;
        for(int i = 0; i < keys; i++){
            sum += arr[i];
        }
        maxSum = Math.max(maxSum, sum);
        for(int i = keys; i < arr.length; i++){
            sum = sum - arr[i-keys] + arr[i];
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum/(double)keys;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int elements = sc.nextInt();


        int[] arr = new int[elements];
        System.out.println("Enter the all elements: ");
        for(int i = 0; i < elements; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter number of elements in sub-array: ");
        int keys = sc.nextInt();

        double ans = findMaxAverage(arr, keys);
        System.out.println(ans);
    }
}
