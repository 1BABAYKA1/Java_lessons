package model;
public class Student extends Person {
    private String group;

    public Student(String name, int age, String group) {
        super(name, age);
        this.group = group;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Group: " + group);
    }
}