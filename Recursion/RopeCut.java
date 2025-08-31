public class RopeCut {

    static int maxCut(int ropeLength, int i, int j, int k){
        if(ropeLength == 0){
            return 0;
        }
        if(ropeLength < 0){
            return -1;
        }
        int firstCut = maxCut(ropeLength-i, i, j, k);
        int secondCut = maxCut(ropeLength-j, i, j, k);
        int thirdCut = maxCut(ropeLength-k, i, j, k);
        int result = Math.max(Math.max(firstCut, secondCut), thirdCut);

        if(result == -1){
            return -1;
        }
        return result+1;
    }

    public static void main(String[] args) {
        System.out.println(maxCut(7, 2, 5, 3));
    }
}
