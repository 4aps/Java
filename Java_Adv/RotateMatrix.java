import java.util.Scanner;

public class RotateMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();

        int arr[][] = new int[rows][rows];
        System.out.print("Enter elements: ");
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < rows; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < rows; j++){
                System.out.print(arr[i][j] + " ");;
            }
            System.out.println();
        }
        System.out.println();

        for(int i = 0; i < rows; i++){
            for(int j = i; j < rows; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
            int left = 0, k = i;
            int right = rows-1;
            while(left < right){
                int temp = arr[k][left];
                arr[k][left] = arr[k][right];
                arr[k][right] = temp;
                k++;
            }
        }

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < rows; j++){
                System.out.print(arr[i][j] + " ");;
            }
            System.out.println();
        }
        System.out.println();


    }
}
