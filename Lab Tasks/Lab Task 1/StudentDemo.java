class Student {

    public String name;
    public String rollNumber;
    public String program;
    public int semester;

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Program: " + program);
        System.out.println("Semester: " + semester);
    }

    public void markPresent() {
        System.out.println("Student is Present"); 
    }

    public void markAbsent() {
        System.out.println("Student is Absent");
    }
}

public class Studentsbehaviour {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Ali";
        s1.rollNumber = "FA25-BMD-001";
        s1.program = "Mathematics and Data Science";
        s1.semester = 3;

        s1.markPresent();
        s1.display();

        Student s2 = new Student();

        s2.name = "Abu zar";
        s2.rollNumber = "FA25-BMD-005";
        s2.program = "Mathematics and Data Science";
        s2.semester = 3;

        s2.markAbsent();
        s2.display();
    }
}
