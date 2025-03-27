public class Rug {
    private String color;
    private String type;
    
    public Rug()
    {
        color = "white";
        type = "square";
    }
    public Rug(String c, String t)
    {
        color = c;
        type = t;
    }
    public String getColor()
    {
        return color;
    }
    public String getType()
    {
        return type;
    }
    public void setColor(String c)
    {
        color = c;
    }
    public void setType(String t)
    {
        type = t;
    }
    @Override
    public String toString()
    {
        return "A " + type + " " + color + " rug";
    }
}
