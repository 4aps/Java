import java.util.HashMap;
import java.util.Scanner;

public class SingleNumber {

    static int singleNumber(int elem[]){
        HashMap <Integer, Integer> map = new HashMap<>();

        int ans = -1;
        for (int i = 0; i < elem.length; i++){
            if(map.get(elem[i]) == null){
                map.put(elem[i], 1);
            }
            else{
                int count = map.get(elem[i]);
                count++;
                map.put(elem[i], count);
            }
        }

        for(int key: map.keySet()){
            if(map.get(key) == 1){
                return key;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int elements = sc.nextInt();


        int[] arr = new int[elements];
        System.out.println("Enter the all elements: ");
        for(int i = 0; i < elements; i++){
            arr[i] = sc.nextInt();
        }

        int ans = singleNumber(arr);
        System.out.println(ans);
    }
}
