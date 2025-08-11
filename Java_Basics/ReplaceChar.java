import java.util.Scanner;

public class ReplaceChar {
    static String result = "";
    static String replace(String str, int index, char s, char r){
        if(str.length() == index){
            return result;
        }
        if(str.charAt(index) == s){
            result += r;
        }
        else{
            result += str.charAt(index);
        }
        return replace(str, index+1, s, r);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string: ");
        String str = sc.nextLine();

        System.out.print("Enter a character to replace: ");
        char s = sc.next().charAt(0);
        System.out.print("Enter a character to replace with: ");
        char r = sc.next().charAt(0);

        String ans = replace(str, 0, s, r);
        System.out.println(ans);
    }
}
