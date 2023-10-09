import java.util.Scanner;

public class targetSum {
    static int pairSum(int arr[], int target){
        int n = arr.length;
        int ans = 0;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j ++){
                if(arr[i]  + arr[j] == target){
                    ans++;
                }
            }
        }
        return ans;
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
        System.out.print("Enter the sum you need: ");
        int target = sc.nextInt();;
        System.out.println("This pairSum is called " + pairSum(arr, target) + " times.");
    }
}
