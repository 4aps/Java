public class SubSequenceOfString {

    static boolean k = true;
    static void printSubSequence(String str, String result){
        if(str.length() == 0){
            if(k){
                k = false;
                System.out.print("\"\"");
            }
            System.out.print(result + ", ");
            return;
        }
        printSubSequence(str.substring(1), result);
        printSubSequence(str.substring(1), result + str.charAt(0));
    }

    public static void main(String[] args) {
        printSubSequence("abc", "");
    }
}
