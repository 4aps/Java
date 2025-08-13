import java.util.Scanner;

public class BinaryToDecimalString {
    static int binaryToDecimal(String binaryStr, int index) {

        if (index == binaryStr.length()) {
            return 0;
        }

        int bit = binaryStr.charAt(index) - '0';
        System.out.println(bit);

        return (bit << (binaryStr.length() - 1 - index)) + binaryToDecimal(binaryStr, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");

        String binaryInput = sc.nextLine();

        if (!binaryInput.matches("[01]+")) {
            System.out.println("Invalid binary number. Only 0 and 1 are allowed.");
            return;
        }

        int decimalOutput = binaryToDecimal(binaryInput, 0);

        System.out.println("Binary: " + binaryInput);
        System.out.println("Decimal: " + decimalOutput);
        sc.close();
    }
}
