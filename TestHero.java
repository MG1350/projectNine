import java.util.ArrayList;

public class TestHero {
    public static void main(String args[])
    {
        ArrayList<Hero> heroes = new ArrayList<>();
        Hero h1 = new Hero();
        Hero h2 = new Hero(0, "Knight", "Arthur");
        Mage m1 = new Mage();
        Hero m2 = new Mage(6, "Gandalf", 0);
        Wizard w1 = new Wizard();
        Hero w2 = new Wizard(5, "Dumbledore", 10, 0);
        Hero alias1 = m1;
        Hero alias2 = w1;
        Hero alias3 = w2;
        Hero alias4 = alias3;
        heroes.add(h1);
        heroes.add(h2);
        heroes.add(m1);
        heroes.add(m2);
        heroes.add(w1);
        heroes.add(w2);
        heroes.add(alias1);
        heroes.add(alias2);
        heroes.add(alias3);
        heroes.add(alias4);
        System.out.println("==Testing Hero Methods==");
        h1.attack(h2);
        System.out.println("Checking checkHealth method with h2: " + h2.checkHealth());
        System.out.println("Checking equal method with h1 and h2: " + h1.equals(h2));
        System.out.println(h1);
        System.out.println("==Testing Mage Methods==");
        m1.attack(h1);
        m1.recharge();
        m1.heal();
        System.out.println("Checking equal method with m1 and m2: " + m1.equals(m2));
        System.out.println(m1);
        System.out.println("==Testing Wizard Methods==");
        w1.attack(m1);
        w1.absorbMana();
        w1.teleport();
        System.out.println("Checking equal method with w1 and w2: " + w1.equals(w2));
        System.out.println(w1);

    }
}