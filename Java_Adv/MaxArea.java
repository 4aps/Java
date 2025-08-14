import java.util.Arrays;
import java.util.Scanner;

public class MaxArea {
    static int maxAreaContainer(int arr[]){
        int left = 0, right = arr.length-1;
        int maxArea = 0;
        while(left < right){
            int minHeight = (arr[left] > arr[right]) ? arr[right] : arr[left];
            int ans =  minHeight * (right-left);
            if(maxArea < ans){
                maxArea = ans;
            }
            if((arr[left] <= arr[right])){
                left++;
            }
            else{
                right--;
            }
        }
        return maxArea;
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

        int ans = maxAreaContainer(arr);
        System.out.println(ans);
    }
}
