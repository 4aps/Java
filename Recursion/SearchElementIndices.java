import java.util.Arrays;
import java.util.Scanner;

public class SearchElementIndices {

    static int[] ans;
    static int k = 0;
    static int countOccurrences(int[] arr, int key, int i) {
        if (i >= arr.length) return 0;
        return (arr[i] == key ? 1 : 0) + countOccurrences(arr, key, i + 1);
    }

    static int[] findIndices(int arr[], int key, int index){
        if(index >= arr.length){
            return ans;
        }
        if(arr[index] == key){
            ans[k++] = index;
        }
        return findIndices(arr, key, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int size = sc.nextInt();

        System.out.print("Enter elements for an array: ");
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter a number to search: ");
        int key = sc.nextInt();

        int count = countOccurrences(arr, key, 0);

        if (count == 0) {
            System.out.println("Key not found.");
        } else {
            ans = new int[count];
            int[] result = findIndices(arr, key, 0);
            System.out.println(key + " is at Indices: " + Arrays.toString(result));
        }

    }

}
