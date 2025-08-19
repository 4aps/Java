import java.util.Scanner;

public class ReverseHollowPyramid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int range = sc.nextInt();

        for(int i = 0; i < range; i++){
            for(int j = 0; j < 2*range-1; j++){
                if(i == 0 || i == j || i + j == 2*range - 2){
                    System.out.print("*  ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
