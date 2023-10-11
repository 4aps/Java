import java.util.Scanner;

public class AskQueryInArray {

    static int[] makeFreqArray(int[] arr){
        int[] freqArray = new int[100005];
        for (int i = 0; i < arr.length; i++){
            freqArray[arr[i]]++;
        }
        return freqArray;
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
        int[] freqArray = makeFreqArray(arr);

        System.out.print("Enter the number of queries: ");
        int q = sc.nextInt();
        while(q > 0){
            System.out.print("Enter number to be searched: ");
            int x = sc.nextInt();
            if(freqArray[x] > 0){
                System.out.println("YES");
            }
            else
                System.out.println("NO");
            q--;
        }
    }
}
