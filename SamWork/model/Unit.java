package model;

public class Unit {
    private int health;
    private String name;

    public Unit(int health, String name) {
        this.health = health;
        this.name = name;
    }

    public void printInfo() {
        System.out.println("Unit: " + name + ", Health: " + health);
    }

    public Unit(Unit other) {
        this.health = other.health;
        this.name = other.name;
    }
}