package ArraysBasics;//NOT FOR NON-SQUARE MATRIX

import java.util.Scanner;

public class transposeInPlace {
    static void transpose(int[][]a, int r1, int c1){
        for(int i = 0; i < c1; i++){
            for(int j = i; j < r1; j++){
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns for matrix-1: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] matrixA = new int[r1][c1];
        System.out.println("Enter "+ r1*c1 +" elements in matrix-A: ");
        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c1; j++){
                matrixA[i][j] = sc.nextInt();
            }
        }
        System.out.println("The matrix-A before transpose: ");
        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c1; j++){
                System.out.print(matrixA[i][j]+ "  ");
            }
            System.out.println();
        }
        transpose(matrixA, r1, c1);
        System.out.println("The matrix-A after transpose: ");
        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c1; j++){
                System.out.print(matrixA[i][j]+ "  ");
            }
            System.out.println();
        }
    }
}
