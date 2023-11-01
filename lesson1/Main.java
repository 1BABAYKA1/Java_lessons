import model.Person;
import model.Student;


public class Main {
    public static void main(String[] args) {
        Person person = new Person("Sasha", 18);
        Student student = new Student("Ivan", 18, "MP23504");
        student.printInfo();
        person.printInfo();
    }
}
