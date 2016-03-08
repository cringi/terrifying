public class Student extends Person {
    private static int studentId;
    private int level;

    public Student(String fName, String lName, int gLevel) {
        super(fName, lName);
        if(gLevel < 0 || gLevel > 12) {
            level = 0;
        }
        else {
            level = gLevel;
        }
    }

    public int getLevel() {
        return level;
    }

    public String toString() {
        return super.toString() + String.format("%n   Grade level: %d%n   ID #: %d", level, studentId);
    }
}
