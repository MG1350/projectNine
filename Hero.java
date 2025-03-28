public class Hero {
    private int health;
    private String type;
    private String name;
    
    public Hero()
    {
        health = 5;
        type = "knight";
        name = "Mav";
    }
    public Hero(int c, String t, String n)
    {
        health = c;
        type = t;
        name = n;
    }
    public int getHealth()
    {
        return health;
    }
    public String getType()
    {
        return type;
    }
    public String getName()
    {
        return name;
    }
    public void setHealth(int c)
    {
        health = c;
    }
    public void setType(String t)
    {
        type = t;
    }
    public void setName(String t)
    {
        name = t;
    }
    public boolean checkHealth()
    {
        return health > 0;
    }
    public String toString()
    {
        return "A " + type + " named " + name + " with " + health + " health.";
    }
    public boolean equals(Hero n)
    {
        return health == n.getHealth() && type == n.getType() && name == n.getName();
    }
    public void attack(Hero n)
    {
        System.out.println(name + " attacks and does 1 damage.");
        n.setHealth(n.getHealth()-1);
        if(n.checkHealth())
        {
            System.out.println(n.getName() + " now has " + n.getHealth() + " health.");
        }
        else
        {
            System.out.println(name + " has downed " + n.getName());
        }
    }
}
