public class TestHero {
    public static void main(String args[])
    {
        Hero mav = new Mage(0, "Mav", 1);
        Hero mav1 = new Mage(0, "Mav", 1);
        Hero james = new Hero(1,"mage", "James");
        System.out.println(mav);
        System.out.println(mav.equals(mav1));
        mav.attack(james);
        System.out.println(james);
    }
}