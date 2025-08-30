public class AdjacentStar {

    static String printAdjacentStar(String str){
        if(str.length() < 2){
            return str;
        }

        if(str.charAt(0) == str.charAt(1)){
            return str.charAt(0) + "*" + printAdjacentStar(str.substring(1));
        }
        else{
            return str.charAt(0) + printAdjacentStar(str.substring(1));
        }
    }

    public static void main(String[] args) {
        System.out.println(printAdjacentStar("AABB"));
    }
}
