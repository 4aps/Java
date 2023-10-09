import stdPack.accModif.App;

public class newOutClass {

    public static void main(String[] args) {
        App obj = new App();
        System.out.println("Outside package, non-child class shows: "+ obj.str_1);

        App2 obj1 = new App2();
        obj1.printFromChildClass();
    }
}

//  'App2' is the child class of parent class 'App'
class App2 extends App{
    void printFromChildClass(){
        App2 obj = new App2();
        System.out.println("Outside package, child class shows: "+ obj.str_1);
    }
}
