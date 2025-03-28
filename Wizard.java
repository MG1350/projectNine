public class Wizard extends Mage {
    private int mana;
    public Wizard() {
        super(5, "Wizard", 5);
        mana = 10;
    }
    public Wizard(int c, String n, int s, int m) {
        super(c, n, s);
        mana = m;
    }
    public int getMana()
    {
        return mana;
    }
    public void setMana(int n)
    {
        mana = n;
    }
    public String toString() 
    {
        return super.toString() + " and " + mana + " mana.";
    }
    public boolean equals(Wizard n)
    {
        return super.equals(n) && mana == n.getMana();
    }
    public void absorbMana() 
    {
        mana += 4;
        System.out.println(super.getName() + " absorbed mana. Now has " + mana + " mana.");
    }
    public void teleport() 
    {
        System.out.println(super.getName() + " teleported away to safety!");
    }
    public void attack(Hero n)
    {
        if(super.checkHealth() && mana > 0)
        {
            System.out.println(super.getName() + " uses a magic blast and does 2 damage.");
            n.setHealth(n.getHealth()-2);
            mana--;
            if(n.checkHealth())
            {
                System.out.println(n.getName() + " now has " + n.getHealth() + " health.");
            }
            else
            {
                System.out.println(super.getName() + " has downed " + n.getName());
            }
        }
        else
        {
            if(!super.checkHealth())
            {
                System.out.println(super.getName() + " is hurt and can't move!");
            }
            else
            {
                System.out.println(super.getName() + " is out of mana!");
            }
        }
    }
}
