package uni;

import java.util.HashMap;
import java.util.Map;

public class Transcript {
    int studentID;
    HashMap<Integer, Double> transcript;

    public Transcript(int studentID) {
        this.studentID = studentID;
        this.transcript = new HashMap<>();
    }
    public void setGrade(int presentedCourseID, double grade) {
        PresentedCourse pc = PresentedCourse.findById(presentedCourseID);
        if (PresentedCourse.findById(presentedCourseID) != null ){
            this.transcript.put(presentedCourseID, grade);
        }else {
            System.out.println("Course not found");
        }
    }
    public void printTranscript() {
        for (Map.Entry<Integer, Double> entry : this.transcript.entrySet()) {
            PresentedCourse pc = PresentedCourse.findById(entry.getKey());
                String titleCourse = Course.findById(pc.courseID).title;
                double grade = entry.getValue();
                System.out.println(titleCourse + ":" + "\t" + grade);

        }
    }
    public double getGPA() {
        if (this.transcript.size() == 0){
            return 0.0;
        }
        double totalPoints = 0;
        double totalTnits = 0;
        for (Map.Entry<Integer, Double> entry : this.transcript.entrySet()) {
            int courseID = entry.getKey();
            double grade = entry.getValue();

            int units = Course.findById(courseID).units;

            totalPoints += grade * units;
            totalTnits += units;
        }
        return totalPoints/totalTnits;
    }
}
