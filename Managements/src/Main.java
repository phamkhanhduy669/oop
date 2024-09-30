public class Main {
    public static void main(String[] args) {
        Student student = new Student("Nguyen Duy Anh", 2005, "23020512");
        Person person = new Person("Nguyen Hai Duong", 2005);
        Teacher teacher = new Teacher("Dang Quoc Huy", 2005);

        System.out.println(student);
        System.out.println(person);
        System.out.println(teacher);
    }
}
