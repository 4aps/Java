import java.util.Scanner;

public class test2 {
    static void gap(int g){
        int i = 0;
        while (i < g){
            System.out.print(" ");
            i++;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            int g = 15 - s1.length();
            if(x<100 && x>=10){
                System.out.print(s1);
                gap(g);
                System.out.println("0"+x);
            } else if (x<10 && x>=0) {
                System.out.print(s1);
                gap(g);
                System.out.println("00"+x);
            }
            else{
                System.out.print(s1);
                gap(g);
                System.out.println(x);
            }
        }
        System.out.println("================================");

    }

}
