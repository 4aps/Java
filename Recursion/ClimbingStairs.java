public class ClimbingStairs {

    static int climb(int n){
        if(n <= 1){
            return 1;
        }
        int step1 = climb(n-1);
        int step2 = climb(n-2);
        return step1 + step2;
    }

    public static void main(String[] args) {
        System.out.println(climb(5));
    }
}
