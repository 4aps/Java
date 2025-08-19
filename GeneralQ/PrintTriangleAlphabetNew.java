import java.util.Scanner;

public class PrintTriangleAlphabetNew {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter rows: ");
            int range = sc.nextInt();


            for(int i = 0; i < range; i++){
                char ch = 'A';
                for (int j = 0; j <= i; j++){
                    System.out.print(ch + " ");
                    ch++;
                }
                System.out.println();
            }
        }
}
