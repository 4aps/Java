import java.util.Stack;
import java.util.Scanner;

public class RemoveDuplicates {

    public String removeDuplicates(String s) {
        Stack<Character> St = new Stack<Character>();
        for(char c: s.toCharArray()){
            if(!St.isEmpty() && St.peek() == c){
                St.pop();
            }else{
                St.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!St.isEmpty()){
            sb.append(St.pop());
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        RemoveDuplicates rd = new RemoveDuplicates();
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Remove Duplicates Program ===");
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String result = rd.removeDuplicates(input);

        System.out.println("\nInput: \"" + input + "\"");
        System.out.println("Output: \"" + result + "\"");

        sc.close();
    }
}
