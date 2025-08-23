public class SetMatrixZero {

    static void setMatrixZero(int[][] arr){
        int n = arr.length;
        int[] row = new int[n];
        int[] col = new int[n];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if(arr[i][j] == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if(row[i] == 1 || col[j] == 1){
                    arr[i][j] = 0;
                }
            }
        }

    }

    public static void main(String[] args) {
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");;
            }
            System.out.println();
        }
        System.out.println();

        setMatrixZero(matrix);

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");;
            }
            System.out.println();
        }
        System.out.println();
    }
}
