public class HighSchoolStudent extends Student {
    double gpa;

    public HighSchoolStudent(String fName, String lName, int gLevel, double studentGpa) {
        super(fName, lName, gLevel);
        if (studentGpa < 0 || studentGpa > 5) {
            gpa = 0;
        }
        else {
            gpa = studentGpa;
        }
    }

    public String toString() {
        return super.toString() + String.format("%n   GPA: %.1f", gpa);
    }
}
