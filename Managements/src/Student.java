public class Student extends Person {
    private String studentID;
    public Student(String name, int birthYear, String studentID) {
        super(name, birthYear);
        this.studentID = studentID;

    }

    public String getStudentID() {
        return studentID;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + studentID;
    }

}
