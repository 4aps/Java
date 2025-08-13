import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class countLines {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("hello.txt");
        Scanner sc = new Scanner(file);
        int lines = 0;

//        while (sc.hasNext()) {
//            String word = sc.next();
//            System.out.println(word);
//        }

        while (sc.hasNextLine()) {
            sc.nextLine();
            lines++;
        }

        sc.close();
        System.out.println("Total lines: " + lines);
    }
}
