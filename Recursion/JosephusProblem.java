public class JosephusProblem {
    static int deathRound(int people, int k){
        if(people <= 1){
            return 0;
        }
        return (deathRound(people-1, k) + k) % people;
    }

    public static void main(String[] args) {

        System.out.println(deathRound(5, 2));
    }
}
