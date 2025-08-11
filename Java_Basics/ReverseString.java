import java.util.Scanner;

public class ReverseString {
    public void reverseString(char[] s) {
        int n = s.length;
        int start = 0, end = n - 1;
        while (start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        ReverseString rs = new ReverseString();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string: ");
        String str = sc.nextLine();

//        char[] s = new char[str.length()];
//        for(int i = 0; i < str.length(); i++){
//            s[i] = str.charAt(i);
//        }

        char[] s = str.toCharArray();
        System.out.println("Before: " + new String(s));
        rs.reverseString(s);
        System.out.println("After: " + new String(s));
    }
}
