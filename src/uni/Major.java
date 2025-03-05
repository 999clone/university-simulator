package uni;

import java.util.ArrayList;

public class Major {
    int majorId;
    static ArrayList<Major> majorList = new ArrayList<Major>();
    String name;
    final int maxCapacity;
    int numberOfStudents = 0;

        public Major(String name, int maxCapacity) {
            this.name = name;
            this.maxCapacity = maxCapacity;
            majorList.add(this);
            majorId = majorList.size() + 10;
        }
        public static Major findById(int majorId) {
            for (Major major : majorList) {
                if (major.majorId == majorId) {
                    return major;
                }
            }
            return null;
        }
        public void addStudent() {
            if (numberOfStudents >= maxCapacity) {
                System.out.println("Maximum capacity exceeded");
            }else
                numberOfStudents++;
        }
}
