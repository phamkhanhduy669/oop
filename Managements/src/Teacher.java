public class Teacher extends Person {
    public Teacher(String name, int birthYear) {
        super(name, birthYear);
    }

    @Override
    public String toString() {
        return super.toString() + " - Teacher";
    }
}
