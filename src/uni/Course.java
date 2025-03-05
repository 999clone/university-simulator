package uni;

import java.util.ArrayList;

public class Course {
    int courseID;
    static ArrayList<Course> courseList = new ArrayList<Course>();
    String title;
    int units;

        public Course(String title, int units) {
            this.title = title;
            this.units = units;
            courseList.add(this);
            courseID = courseList.size();
        }
        public static Course findById(int id) {
            for (Course course : courseList) {
                if (course.courseID == id) {
                    return course;
                }
            }
            return null;
        }
}
