package uni;

import base.Person;

public class Main {
    public static void main(String[] args) {
        Major cs = new Major("Computer Science", 50);
        Major math = new Major("Mathematics", 40);

        Person p1 = new Person("Mamad", "123456789");
        Person p2 = new Person("Ali", "234567890");
        Person p3 = new Person("Gholi", "345678901");
        Person p4 = new Person("Hasan", "456789012");
        Person p5 = new Person("Behzad", "567890123");

        Student s1 = new Student(1, 403, 11);
        Student s2 = new Student(2, 403, 11);
        Student s3 = new Student(3, 403, 12);

        System.out.println(Person.findById(s1.personID) + " " + s1.studentCode);
        System.out.println(Person.findById(s2.personID) + " " + s2.studentCode);
        System.out.println(Person.findById(s3.personID) + " " + s3.studentCode);
        System.out.println();

        Professor professor1 = new Professor(4, 11);
        Professor professor2 = new Professor(5, 12);

        System.out.println(Professor.findById(professor1.professorID));
        System.out.println(Professor.findById(professor2.professorID));
        System.out.println();

        Course c1 = new Course("Basic Programming", 3);
        Course c2 = new Course("Advanced Programming", 4);
        Course c3 = new Course("Calculus 2", 3);

        PresentedCourse pc1 = new PresentedCourse(1, 1, 30);
        PresentedCourse pc2 = new PresentedCourse(2, 1, 25);
        PresentedCourse pc3 = new PresentedCourse(3, 2, 20);

        pc1.addStudent(1);
        pc1.addStudent(2);

        pc2.addStudent(1);
        pc2.addStudent(2);
        pc2.addStudent(3);

        pc3.addStudent(13);

        Transcript t1 = new Transcript(1);
        t1.setGrade(1, 18.5);
        t1.setGrade(2, 17.0);

        Transcript t2 = new Transcript(2);
        t2.setGrade(1, 19.0);
        t2.setGrade(2, 18.0);

        Transcript t3 = new Transcript(3);
        t3.setGrade(2, 15.0);
        t3.setGrade(3, 17.5);

        t1.printTranscript();
        System.out.println("GPA: " + t1.getGPA());
        System.out.println();

        t2.printTranscript();
        System.out.println("GPA: " + t2.getGPA());
        System.out.println();

        t3.printTranscript();
        System.out.println("GPA: " + t3.getGPA());
        System.out.println();
    }
}
