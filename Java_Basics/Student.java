package OOPsInJava;

public class Student {
    String name;
    int rno;
    double percent;

    final String schoolName = "PDDUSDV";

    private static int numberOfStudents;

    //getter
    public int getRno(){
        return rno;
    }

    //setter
    public void setRno(int roll){
        this.rno = roll;
    }

    public Student(String name, double percentage, int rno){
        this.name = name;
        this.rno = rno;
        this.percent = percentage;
        numberOfStudents++;
    }

    public Student(){
    }

    public static int getNumberOfStudents(){
        return numberOfStudents;
    }
}
