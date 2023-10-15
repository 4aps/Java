package OOPsInJava;

public class StudentClass {
    public static void change(Student s){
        s.name = "Rohan";
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Mohan";
        s1.percent = 92.2;
        s1.rno = 23;

//        System.out.println(s1.name);
//        System.out.println(s1.rno);
//        System.out.println(s1.percent);
//
//        System.out.println(s1.schoolName);

//        System.out.println(s1.getRno());
//        s1.setRno(72);
//        System.out.println(s1.getRno());

        Student s2 = new Student("Kaen", 97.87,7);
//        System.out.println(s2.name);
//        System.out.println(s2.rno);
//        System.out.println(s2.percent);
//        System.out.println(s2.schoolName);

        System.out.println(Student.getNumberOfStudents());
        System.out.println(s2.getNumberOfStudents());
        Student s3 = new Student("Dino", 37.87,17);
        System.out.println(s3.getNumberOfStudents());

        Student s4 = new Student("DK", 99.12,1);
        System.out.println(s4.getNumberOfStudents());
    }
}
