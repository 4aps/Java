public class MazePathProblem {

    static void MazePath(int row, int col, int endRow, int endCol, String result){
        if(col == endCol && row == endRow){
            System.out.println(result);
            return;
        }

        if(col > endCol || row > endRow){
            return;
        }

        MazePath(row, col+1, endRow, endCol, result + "H");
        MazePath(row+1, col, endRow, endCol, result + "V");
    }

    public static void main(String[] args) {
        MazePath(0, 0, 2, 2, "");
    }
}
