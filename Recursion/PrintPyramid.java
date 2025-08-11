import java.util.Scanner;

public class PrintPyramid {

    static void printStar(int rows){
        if(rows == 0){
            System.out.println();
            return;
        }
        System.out.print("* ");
        printStar(rows-1);
    }

    static void triangle(int rows){
        if(rows == 0){
            return;
        }
        triangle(rows-1);
        printStar(rows);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string: ");
        int rows = sc.nextInt();

        triangle(rows);

    }
}
