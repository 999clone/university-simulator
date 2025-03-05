package uni;

import java.util.ArrayList;

public class Student {
    int studentID;
    static ArrayList<Student> studentList = new ArrayList<Student>();
    int personID;
    final int enteranceYear;
    int majorID;
    String studentCode;

        public Student(int personID, int enteranceYear, int majorID) {
            this.personID = personID;
            this.enteranceYear = enteranceYear;
            this.majorID = majorID;
            Major.findById(majorID).addStudent();
            getStudentCode();
            studentList.add(this);
            studentID = studentList.size();
        }
        public static Student findById(int ID) {
            for (Student student : studentList) {
                if (student.studentID == ID) {
                    return student;
                }
            }
            return null;
        }
        public void getStudentCode(){
            studentCode = String.valueOf(enteranceYear) + String.valueOf(majorID)+ "0" + String.valueOf(Major.findById(majorID).numberOfStudents);
        }


}
