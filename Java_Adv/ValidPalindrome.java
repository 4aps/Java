import java.util.Scanner;

public class ValidPalindrome {
    static boolean isPalindrome(String s) {

      // METHOD-1
      
//        String cleaned = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
//        int left = 0, right = cleaned.length()-1;
//        System.out.println(cleaned);
//
//        while (left < right){
//            if(cleaned.charAt(left) == cleaned.charAt(right)){
//                left++;
//                right--;
//            }
//            else return false;
//        }
//        return true;

  // METHOD-2
      
        int left = 0, right = s.length()-1;
        while(left < right){
            while(left < right && !Character.isLetterOrDigit(s.charAt(left))) left++;
            while(left < right && !Character.isLetterOrDigit(s.charAt(right))) right--;

            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println(str.length());
        boolean ans = isPalindrome(str);
        System.out.println(ans);
    }
}
