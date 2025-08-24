import java.util.ArrayList;
import java.util.Arrays;

public class MergeIntervals {

    static int[][] mergerIntervals(int[][] arr){
        int n = arr.length;
        int m = arr[0].length;

        ArrayList <int[]> result = new ArrayList<>();
        for(int[] interval : arr){
            if(result.size() == 0 || result.get(result.size()-1)[1] < interval[0]) {
                result.add(interval);
            }
            else{
                result.get(result.size()-1)[1] = Math.max(result.get(result.size()-1)[1], interval[1]);
            }
        }
        return result.toArray(new int[result.size()][]);
    }


    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        mergerIntervals(intervals);

        for (int i = 0; i < intervals.length; i++){
            for (int j = 0; j < intervals[0].length; j++){
                System.out.print(intervals[i][j] + " ");;
            }
            System.out.println();
        }



    }
}
