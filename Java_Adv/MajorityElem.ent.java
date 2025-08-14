import java.util.HashMap;
import java.util.Scanner;

public class MajorityElement {

    static int majorityElement(int arr[]){

//        HashMap<Integer, Integer> map = new HashMap<>();
//
//        for(int i = 0; i < arr.length; i++){
//            if (map.get(arr[i]) == null) {
//                map.put(arr[i], 1);
//            }
//            else{
//                int count = map.get(arr[i]);
//                count++;
//                map.put(arr[i], count);
//                if(count > arr.length/2)
//                    return arr[i];
//            }
//        }
//        return 0;

        int count = 0, candidate = 0;
        for(int i = 0; i < arr.length; i++){
            if(count == 0) candidate = arr[i];
            count += (arr[i] == candidate) ? 1 : -1;
        }
        return candidate;
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

        int ans = majorityElement(arr);
        System.out.println(ans);
    }
}
