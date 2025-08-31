public class BoardProblem {

    static void boardValue(int currentVal, int endVal, String result){
        if(currentVal == endVal){
            System.out.print(result + ", ");
            return;
        }
        if(currentVal > endVal){
            return;
        }

        for (int dice = 1; dice <= 6; dice++){
            boardValue(currentVal+dice, endVal, result + dice);
        }
    }

    public static void main(String[] args) {
        boardValue(0, 6, "");
    }
}
