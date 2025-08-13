import java.util.Scanner;

public class HollowTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows: ");
        int range = sc.nextInt();

        for(int row = 1; row <= range; row++){
            for (int col = 1; col <= range+row-1; col++){
                if(col == range - row + 1  || row == range || col == range+row-1){
                    System.out.print("*  ");
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
