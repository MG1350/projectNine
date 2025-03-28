public class Mage extends Hero {
    private int spells;
    public Mage()
    {
        super(5, "Mage", "Mage");
        spells = 5;
    }
    public Mage(int c, String n, int s)
    {
        super(c, "Mage", n);
        spells = s;
    }
    public int getSpells()
    {
        return spells;
    }
    public void setSpells(int n)
    {
        spells = n;
    }
    public String toString()
    {
        return super.toString() + " and " + spells + " spells";
    }
    public boolean equals(Mage n)
    {
        return super.equals(n) && spells == n.getSpells();
    }
    // Two Unique Methods
    public void recharge() 
    {
        spells += 2;
        System.out.println(super.getName() + " recharged spells. Now has " + spells + " spells.");
    }
    public void heal() 
    {
        super.setHealth(super.getHealth() + 2);
        System.out.println(super.getName() + " healed and now has " + super.getHealth() + " health.");
    }
    // Overriden Method
    public void attack(Hero n)
    {
        if(super.checkHealth() && spells > 0)
        {
            System.out.println(super.getName() + " casts a spell and does 2 damage.");
            n.setHealth(n.getHealth()-2);
            spells--;
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
                System.out.println(super.getName() + " is out of spells!");
            }
        }
    }
}
