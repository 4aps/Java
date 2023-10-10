import java.util.Scanner;

public class arrayOp {
    static int[] rotateArr(int[] arr, int k){
        int n = arr.length;
        k = k % n;
        int[] ans = new int[n];
        int j = 0;
        for(int i = n-k; i<n; i++ ){
            ans[j++] = arr[i];
        }
        for(int i = 0; i < n-k; i++){
            ans[j++] = arr[i];
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
        System.out.print("Enter the number of times you want to rotate: ");
        int k = sc.nextInt();
        int[] ans = rotateArr(arr, k);
        System.out.print("The rotated array is: ");
        for (int i = 0; i < ans.length; i++){
            System.out.print(ans[i] +"  ");
        }
    }
}
