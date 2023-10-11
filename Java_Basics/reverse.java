import java.util.Scanner;

public class reverse {

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void reverseArr(int[] arr) {
        int n = arr.length;
        int j = n - 1, i = 0;
        while (i < j){
            swap(arr, i, j);
            i++;
            j--;
        }
    }
    static void sortSqrArray(int[] arr){
        int n = arr.length;
        int left = 0, right = n - 1;
        int[] ans = new int[n];
        int k = 0;
        while(left <= right){
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[k++] = arr[left] * arr[left];
                left++;
            }else{
                ans[k++] = arr[right] * arr[right];
                right--;
            }
        }
        reverseArr(ans);
        for(int i = 0; i < ans.length; i++){
            System.out.print(ans[i]+ " ");
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
        System.out.println("The sorted array is: ");
        sortSqrArray(arr);
    }
}
