public class Teacher extends Person {
    private String subject;

    public Teacher(String fName, String lName, String teacherSubject) {
        super(fName, lName);
        subject = teacherSubject;
    }

    public String toString() {
        return super.toString() + String.format("%n   Subject: %s", subject);
    }
}
