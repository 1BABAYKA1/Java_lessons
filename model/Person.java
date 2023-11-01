package model;
public class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        if (age > 0 && age < 200) {
            this.age = age;
        } else {
            this.age = 0;
        }
            this.name = name;
    }

    public void printInfo() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
    public int birthday() {
        age++;
        return age;
        }
    }