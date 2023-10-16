package OOPsInJava;

public class OuterClass2 {
    private int outerData;

    public OuterClass2(int data) {
        this.outerData = data;
    }

    public class InnerClass {
        public void display() {
            System.out.println("Outer data: " + outerData);
        }
    }

    public static void main(String[] args) {
        OuterClass2 outerObj = new OuterClass2(42);
        OuterClass2.InnerClass innerObj = outerObj.new InnerClass();
        innerObj.display(); // Output: Outer data: 42
    }
}
