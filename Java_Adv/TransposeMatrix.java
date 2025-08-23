import java.util.Scanner;

public class TransposeMatrix {

    static int[][] transpose(int[][] arr){
        int n = arr.length;
        int m = arr[0].length;

        int arrNew[][] = new int[m][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arrNew[j][i] = arr[i][j];
            }
        }
        return arrNew;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int m = sc.nextInt();

        int arr[][] = new int[n][m];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int[][] transposed = transpose(arr);

        for(int i = 0; i < transposed.length; i++) {
            for (int j = 0; j < transposed[i].length; j++) {
                System.out.print(transposed[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
