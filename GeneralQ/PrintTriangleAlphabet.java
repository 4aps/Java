import java.util.Scanner;

public class PrintTriangleAlphabet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int range = sc.nextInt();

        int num = 65;
        for(int i = 0; i < range; i++){
            for (int j = 0; j <= i; j++){
                System.out.print((char)(num) + " ");
                num++;
            }
            System.out.println();
        }
    }
}
