import java.util.Scanner;

public class Star8Pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range: ");
        int range = sc.nextInt();

        for(int row = 1; row < 2*range; row++){
            for (int col = 1; col <= range; col++){
                if((row == 1  || row == range || row == 2 * range-1) && (col == 1 || col == range)){
                    System.out.print("   ");
                } else if (row == 1 || row == range || row == 2*range-1 || col == 1 || col == range) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
