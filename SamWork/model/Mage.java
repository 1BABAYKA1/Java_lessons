package model;

public class Mage extends Unit {
    private int mana;

    public Mage(int health, String name, int mana) {
        super(health, name);
        this.mana = mana;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Mana: " + mana);
    }

    public Mage(Mage other) {
        super(other);
        this.mana = other.mana;
    }
}