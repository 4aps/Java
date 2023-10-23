import java.util.*;
import java.io.*;

class test3{

    static void sum(int a, int b, int n){
        int sum = 0;
        sum = sum + a;
        for(int i = 0; i < n; i++){
            int p = (int) Math.pow(2,i);
            sum += p*b;
            System.out.print(sum +" ");
        }
        System.out.println();
    }
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            sum(a, b ,n);
        }

        in.close();
    }
