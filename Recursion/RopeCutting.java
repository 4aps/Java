import java.util.ArrayList;
import java.util.Scanner;

public class RopeCutting {
    ArrayList<Integer> ans = new ArrayList<>();
    boolean first = true;
    public ArrayList<Integer> RopeCut(int[] arr){
        int zero = 0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == 0)
                zero++;
        }
        if(zero >= arr.length)
            return ans;

        int min = Integer.MAX_VALUE;
        for(int length : arr){
            if(length < min && length > 0){
                min = length;
            }
        }

        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                arr[i] = arr[i] - min;
                count++;
            }
        }
        if(!first){
            ans.add(count);
        }
        first = false;
        return RopeCut(arr);
    }


    public static void main(String[] args) {
        RopeCutting rc = new RopeCutting();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = sc.nextInt();

        System.out.println("Enter elements in array: ");
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(rc.RopeCut(arr));
    }
}
