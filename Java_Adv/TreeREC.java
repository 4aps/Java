public class TreeREC {
    static void fun(int num){
        if(num <= 0)
            return;
        
        System.out.println(num);
        fun(num-1);
        System.out.println(num);
        fun(num-2);
        System.out.println();
    }

    public static void main(String[] args) {
        fun(3);
    }
}
