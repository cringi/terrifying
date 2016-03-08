import java.util.ArrayList;
public class School {
    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Teacher> teachers = new ArrayList<>();

    public School(ArrayList<Student> studentList, ArrayList<Teacher> teacherList) {
        students = studentList;
        teachers = teacherList;
    }

    public String getGradeLevel(int gradeLevel) {
        String all = "";

        for (Student obj: students) {
            if(obj.getLevel() == gradeLevel) {
                all = all + obj.toString() + "\n";
            }
        }

        return all;
    }

    public String toString() {
        String all = "";
        all = all + "Faculty:\n";

        for (Teacher obj: teachers) {
            all = all + obj.toString() + "\n";
        }

        all = all + "Student Body:\n";
        for (Student obj: students) {
            all = all + obj.toString() + "\n";
        }

        return all;
    }
}
