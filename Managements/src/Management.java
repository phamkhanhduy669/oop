public class Management {
    Student [] students = new Student[100];
    int numberOfStudents = 0;
    Teacher [] teachers = new Teacher[100];
    int numberOfTeachers = 0;
    Person [] persons = new Person[100];
    int numberOfPersons = 0;

    public void addStudent (Student student) {
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public void addTeacher(Teacher teacher) {
        teachers[numberOfTeachers] = teacher;
        numberOfTeachers++;
    }

    public void addPerson (Person person) {
        persons[numberOfPersons] = person;
        numberOfPersons++;
    }


    public static void main(String[] args) {
        Student student = new Student("Nguyen Duy Anh", 2005, "23020512");
        Person person = new Person("Nguyen Hai Duong", 2005);
        Teacher teacher = new Teacher("Dang Quoc Huy", 2005);

        Management management = new Management();
        management.addStudent(student);
        management.addTeacher(teacher);
        management.addPerson(person);
    }
}
