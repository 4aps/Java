public class RightTriangleREC {
    static void printStar(int n){
        if(n == 0)
            return;
        System.out.print("* ");
        printStar(n-1);
    }
    static void Pattern(int n){
        if(n == 0){
            return;
        }
        Pattern(n-1);
        printStar(n);
        System.out.println();
    }

    public static void main(String[] args) {
        Pattern(5);
    }
}
