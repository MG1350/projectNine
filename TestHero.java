public class TestRug {
    public static void main(String args[])
    {
        Hero mav = new Hero();
        Hero james = new Hero(5,"mage", "James");
        System.out.println(mav);
        mav.attack(james);
        System.out.println(james);
    }
}