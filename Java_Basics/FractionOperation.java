package OOPsInJava;

public class FractionOperation {

    public static Fraction add(Fraction f1, Fraction f2){
        int numerator = f1.numerator* f2.denominator + f2.numerator*f1.denominator;
        int denominator = f1.denominator* f2.denominator;
        Fraction f3 = new Fraction(numerator, denominator);
        return f3;
    }
    public static class Fraction{
        int numerator;
        int denominator;
        public Fraction(int numerator, int denominator){
            this.numerator = numerator;
            this.denominator = denominator;
            simplifyHCF();
        }
        public void simplifyHCF(){
            int hcf = GCD(numerator, denominator);
            numerator /= hcf;
            denominator /= hcf;
        }
        static int GCD(int x, int y){
            if (y == 0)
                return x;
            return GCD(y, x % y);
        }
    }

    public static void main(String[] args) {
        Fraction f1 = new Fraction(12, 14);
        System.out.println(f1.numerator +"/"+ f1.denominator);
        Fraction f2 = new Fraction(7, 14);
        System.out.println(f2.numerator +"/"+ f2.denominator);
        Fraction f3 = add(f1, f2);
        System.out.println(f3.numerator +"/"+ f3.denominator);
    }
}
