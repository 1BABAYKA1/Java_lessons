import model.Mage;
import model.Unit;

public class Main {
    public static void main(String[] args) {
        Unit unit1 = new Unit(100, "Warrior");
        unit1.printInfo();

        Mage mage1 = new Mage(80, "Wizard", 50);
        mage1.printInfo();

        Unit unit2 = new Unit(unit1);
        unit2.printInfo();

        Mage mage2 = new Mage(mage1);
        mage2.printInfo();
    }
}
