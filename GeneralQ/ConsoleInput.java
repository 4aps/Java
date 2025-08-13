import java.util.Scanner;

public class ConsoleInput {
    public static void main(String[] args) {
        if (System.console() != null) {
            // Terminal mode: password hidden while typing
            System.out.print("Enter the User-ID: ");
            String userID = System.console().readLine();

            System.out.print("Enter the password: ");
            char[] pwd = System.console().readPassword();

            System.out.println("User-ID: " + userID);
            System.out.println("Password: " + new String(pwd));
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the User-ID: ");
            String userID = sc.nextLine();

            System.out.println("Password entry hidden is only supported in terminal.");
            System.out.print("Enter the password: ");
            String pwd = sc.nextLine();

            System.out.println("User-ID: " + userID);
            System.out.println("Password: " + pwd);
            sc.close();
        }
    }
}
