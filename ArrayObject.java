class Student {
    String name;
    int rollno;
    int marks;
}

public class ArrayObject {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Sushil";
        s1.rollno = 10;
        s1.marks = 60;

        Student s2 = new Student();
        s2.name = "Naveen";
        s2.rollno = 12;
        s2.marks = 70;

        Student s3 = new Student();
        s3.name = "Prabeen";
        s3.rollno = 13;
        s3.marks = 80;

        Student student[] = new Student[3];
        student[0] = s1;
        student[1] = s2;
        student[2] = s3;

        // traditional for loop
        // for (int i = 0; i < student.length; i++) {
        // System.out.println("Name : " + student[i].name);
        // System.out.println("Rollno: " + student[i].rollno);
        // System.out.println("Marks: " + student[i].marks);
        // }

        // Enhance for loop
        for (Student n : student) {
            System.out.println(n.name + " " + n.rollno + " " + n.marks);
        }

    }
}