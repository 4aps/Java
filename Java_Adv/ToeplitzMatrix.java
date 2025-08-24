public class ToeplitzMatrix {

    static boolean isToeplitz(int[][] arr){
        int n = arr.length;
        int m = arr[0].length;

        for(int i = 1; i < n; i++){
            for(int j = 1; j < n; j++){
                if(arr[i][j] != arr[i-1][j-1]){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,1,2,3},{9,5,1,2}};
        System.out.println(isToeplitz(matrix));
    }
}
