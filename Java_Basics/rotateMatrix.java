package Arrays2D;

import java.util.Scanner;

public class rotateMatrix {
    static void transpose(int[][]a, int n){
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
    }

    static void rotate(int[][]a, int n){
        transpose(a,n);
        for (int i = 0; i < n; i++){
            reverseArray(a[i]);
        }
    }
    static void reverseArray(int[]a){
        int i = 0, j = a.length-1;
        while(i < j){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
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
        rotate(matrixA, r1);
        System.out.println("The matrix-A after transpose: ");
        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c1; j++){
                System.out.print(matrixA[i][j]+ "  ");
            }
            System.out.println();
        }
    }
}
