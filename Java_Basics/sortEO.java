import java.util.Scanner;

public class sortEO {
        static void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        static void sortOddEven(int[] arr){
            int n = arr.length;
            int left = 0;
            int right = n-1;
            while(left < right){
                if(arr[left] % 2 != 0 && arr[right] % 2 == 0){
                    swap(arr, left, right);
                    left++;
                    right--;
                }
                if(arr[left] % 2 == 0){
                    left++;
                }
                if(arr[right] % 2 != 0){
                    right--;
                }
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
            sortOddEven(arr);
            for(int i = 0; i < arr.length; i++){
                System.out.print(arr[i]+ " ");
            }
        }
}

