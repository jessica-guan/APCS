import java.util.*;
public class Room
{
    private ArrayList<Room> room;
    private ArrayList<Item> stuff;
    private String description;

    public Room ()
    {
        description = "this room";
    }

    public Room(String d)
    {
        room = new ArrayList<>();
        stuff = new ArrayList<>();
        description = d;
    }

    public void addRoom(Room r)
    {
        room.add(r);
    }

    public void addStuff(Item i)
    {
        stuff.add(i);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String d)
    {
        description = d;
    }

    public String toString()
    {
        return "room: " + description + "\n# of rooms: " + room.size() + "\nstuff: " + stuff;
    }
}