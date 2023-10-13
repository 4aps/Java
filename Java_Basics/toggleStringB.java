package Strings;

import java.util.Scanner;

public class toggleStringB {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter any string to toggle: ");
        StringBuilder str = new StringBuilder(sc.nextLine());
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            boolean flag = true;
            if(ch == ' ') continue;
            int ascii = (int)ch;
            if(ascii >= 97) flag = false;
            if(flag == true){
                ascii += 32;
                char toggleCh = (char)ascii;
                str.setCharAt(i, toggleCh);
            }
            else {
                ascii -= 32;
                char toggleCh = (char)ascii;
                str.setCharAt(i, toggleCh);
            }
        }
        System.out.println("Toggled string: "+ str);
    }
}
