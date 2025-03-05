package uni;

import java.util.ArrayList;

public class PresentedCourse {
    int presentedCourseID;
    static ArrayList<PresentedCourse> presentedCourseList = new ArrayList<PresentedCourse>();
    int courseID;
    int professorID;
    int maxCapacity;
    ArrayList <Integer> studentIDList;

        public PresentedCourse(int courseID, int professorID, int maxCapacity) {
            this.courseID = courseID;
            this.professorID = professorID;
            this.maxCapacity = maxCapacity;
            this.studentIDList = new ArrayList<>(maxCapacity);
            presentedCourseList.add(this);
            this.presentedCourseID = presentedCourseList.size();
        }
        public static PresentedCourse findById(int id) {
            for (PresentedCourse p : presentedCourseList) {
                if (p.presentedCourseID == id) {
                    return p;
                }
            }
            return null;
        }
        public void addStudent(int studentID) {
            studentIDList.add(studentID);
        }
}
