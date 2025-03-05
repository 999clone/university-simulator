package uni;

import java.util.ArrayList;

public class Professor {
    int professorID;
    static ArrayList<Professor> professorList = new ArrayList<Professor>();
    int personID;
    int majorID;

        public Professor(int personID, int majorID) {
            this.personID = personID;
            this.majorID = majorID;
            professorList.add(this);
            professorID = professorList.size();
        }
        public static Professor findById(int professorID) {
            for (Professor professor : professorList){
                if (professor.professorID == professorID){
                    return professor;
                }
            }
            return null;
        }

    @Override
    public String toString() {
        return "Professor ID: " + professorID;
    }
}
