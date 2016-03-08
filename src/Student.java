public class Student extends Person {
    private static int idCounter = 0;
    private int level, studentId;

    public Student(String fName, String lName, int gLevel) {
        super(fName, lName);
        if(gLevel < 0 || gLevel > 12) {
            level = 0;
        }
        else {
            level = gLevel;
        }

        studentId = idCounter;
        idCounter++;
    }

    public int getLevel() {
        return level;
    }

    public String toString() {
        return super.toString() + String.format("%n   Grade level: %d%n   ID #: %d", level, studentId);
    }
}
