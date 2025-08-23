public class SwapMinMaxIn2D {

    public static void main(String[] args) {
        int arr[][] = {{1,2}, {2, 3}, {4, 5}, {5, 7}};
        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;
        int minRow = 0, maxRow = 0, minCol = 0,  maxCol = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(minVal > arr[i][j]){
                    minVal = arr[i][j];
                    minRow = i;
                    minCol = j;
                }
                if(maxVal < arr[i][j]){
                    maxVal = arr[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }
        int temp = arr[minRow][minCol];
        arr[minRow][minCol] = arr[maxRow][maxCol];
        arr[maxRow][maxCol] = temp;

        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
