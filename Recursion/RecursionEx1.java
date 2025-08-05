public class RecursionEx1 {

    public static void main(String[] args){
        RecursionEx1 obj = new RecursionEx1();
        obj.display(1);
    }

     void display(int count){
        if(count > 5){
            return;
        }
        System.out.println("Akhand");
        count++;
        display(count);
         System.out.println("Pratap");
    }
}
