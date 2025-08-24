import java.util.Scanner;

public class RemoveConsecutive {

    static String result = "";
    static String removeConsecutive(String str, int index){
        if(str.length()-1 == index){
            result += str.charAt(str.length()-1);
            return result;
        }
        char x = str.charAt(index);
        if(str.charAt(index+1) != x){
            result += str.charAt(index);
        }
        return removeConsecutive(str, index+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string: ");
        String str = sc.nextLine();

        String ans = removeConsecutive(str, 0);
        System.out.println(ans);
    }
}
