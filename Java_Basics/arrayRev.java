import java.util.Scanner;

public class arrayRev {

    static int[] reverseArray(int[] arr){
        int n = arr.length;
        int[] newArr = new int[n];
        int j = 0;

        for(int i = n-1; i >= 0; i--){
            newArr[j++] = arr[i];
        }
        return newArr;
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
        int[] newArr = reverseArray(arr);
        System.out.print("The reversed array is: ");
        for (int i = 0; i < n; i++){
            System.out.print(newArr[i]+ "  ");
        }
    }
}
