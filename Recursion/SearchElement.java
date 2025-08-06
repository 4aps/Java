import java.util.Scanner;

public class SearchElement {
    static int findIndex(int arr[], int key, int i){
        if(arr[i] == key){
            return i;
        }
        i++;
        return findIndex(arr, key, i);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int size = sc.nextInt();

        System.out.print("Enter elements for an array: ");
        int arr[] = new int[size];
        for (int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter a number to search: ");
        int key = sc.nextInt();

        int index = findIndex(arr, key, 0);
        System.out.println("Number " + key + " is at index: " + index);
    }
}
