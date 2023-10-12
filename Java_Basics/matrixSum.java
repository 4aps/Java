import java.util.Scanner;

public class matrixSum {

    static void add(int[][]a, int[][]b, int r1, int c1, int r2, int c2){
        if(r1 != r2 || c1 != c2){
            System.out.println("Wrong Input - Addition NOT possible...");
            return;
        }
        else{
            for(int i = 0; i < r1; i++){
                for(int j = 0; j < c1; j++){
                    a[i][j] += b[i][j];
                }
            }
            System.out.println("The resulting matrix: ");
            for(int i = 0; i < r1; i++){
                for(int j = 0; j < c1; j++){
                    System.out.print(a[i][j]+ "  ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns for matrix-1: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        System.out.println("Enter number of rows and columns for matrix-2: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int[][] matrixA = new int[r1][c1];
        System.out.println("Enter the elements in matrix-A: ");
        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c1; j++){
                matrixA[i][j] = sc.nextInt();
            }
        }
        int[][] matrixB = new int[r2][c2];
        System.out.println("Enter the elements in matrix-B: ");
        for(int i = 0; i < r2; i++){
            for(int j = 0; j < c2; j++){
                matrixB[i][j] = sc.nextInt();
            }
        }
        System.out.println("The matrix-A before addition: ");
        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c1; j++){
                System.out.print(matrixA[i][j]+ "  ");
            }
            System.out.println();
        }
        System.out.println("The matrix-B before addition: ");
        for(int i = 0; i < r2; i++){
            for(int j = 0; j < c2; j++){
                System.out.print(matrixB[i][j]+ "  ");
            }
            System.out.println();
        }
        add(matrixA, matrixB, r1, c1, r2, c2);
    }
}
