import java.util.Scanner;

public class HollowRightTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int range = sc.nextInt();

        for(int i = 0; i < range; i++){
            for(int j = 0; j <= i; j++){
                if(i == j || i == range-1 || j == 0)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
