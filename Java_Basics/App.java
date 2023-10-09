package stdPack.accModif;

public class App {
    public String str_1 = "I am public member.";
    void printFromClass(){
        System.out.println("Within class1: "+ str_1);
    }

    public static void main(String[] args) {
        App obj = new App();
        obj.printFromClass();
        System.out.println("Within class2: "+ obj.str_1);

        App1 obj2 = new App1();
        obj2.printFromOutsideClass();
    }
}

class App1{
    void printFromOutsideClass(){
        App obj = new App();
        System.out.println("Outside class3:"+ obj.str_1);
    }
}


