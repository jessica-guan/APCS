public class Item
{
    private String description;

    public Item()
    {
        description = "stuff";
    }

    public Item(String d)
    {
        description = d;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String d)
    {
        description = d;
    }

    @Override
    public String toString()
    {
        return description;
    }
}