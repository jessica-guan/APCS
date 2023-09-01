public class House
{
    public static void main(String[] args)
    {
        int i;

        // items
        Item mirror = new Item("mirror"), bed = new Item("bed");
        Item lamp = new Item("lamp"), nightstand= new Item("nightstand");
        Item shower= new Item("shower"), sink= new Item("sink");
        Item toilet= new Item("toilet"), washingMachine= new Item("washing machine");
        Item dryingMachine= new Item("drying machine");
        Item stove = new Item("stove"), oven= new Item("oven"), microwave= new Item("microwave");
        Item table = new Item("table"), chair= new Item("chair");
        Item car = new Item("car"), bike = new Item("bike"), treadmill = new Item("treadmill");
        Item shelf = new Item("shelf"), fridge = new Item("fridge");
        Item sofa = new Item("sofa"), tv = new Item("TV");
        Item shirts = new Item("shirts"), pants = new Item("pants"), socks = new Item("socks");
        Item shoes = new Item("shoes"), underwear = new Item("underwear");

        // rooms
        Room closet1 = new Room("closet 1"), closet2 = new Room("closet 2");
        Room bedroom1 = new Room("bedroom 1"), bedroom2 = new Room("bedroom 2");
        Room kitchen = new Room("kitchen"), bathroom = new Room("bathroom");
        Room garage = new Room("garage"), livingRoom = new Room("living room");
        Room house = new Room("house");

        // closets
        Item[] closet = {shoes, shirts, pants, underwear, socks};   // copy this set of items to both closets
        for (i = 0; i < closet.length; i++)
            closet1.addStuff(closet[i]);
        for (i = 0; i < closet.length; i++)
            closet2.addStuff(closet[i]);

        // bedrooms
        Item[] bedroom = {bed, table, chair, mirror, lamp, nightstand};     // copy this set of items to both bedrooms
        for (i = 0; i < bedroom.length; i++)
            bedroom1.addStuff(bedroom[i]);
        for (i = 0; i < bedroom.length; i++)
            bedroom2.addStuff(bedroom[i]);
        bedroom1.addRoom(closet1);
        bedroom2.addRoom((closet2));

        // bathroom
        // Item[] bath = {shower, sink, toilet, washingMachine, dryingMachine};    // temp array to hold items (will be added to arrayList)
        bathroom.addStuff(shower);
        bathroom.addStuff(sink);
        bathroom.addStuff(toilet);
        bathroom.addStuff(washingMachine);
        bathroom.addStuff(dryingMachine);

        // kitchen
        Item[] cuisine = {stove, sink, oven, fridge, microwave, table, chair, chair, chair, chair, chair};
        for (i = 0; i < cuisine.length; i++)
            kitchen.addStuff(cuisine[i]);

        // living room
        Item[] living = {sofa, tv, table};
        for (i = 0; i < living.length; i++)
            livingRoom.addStuff(cuisine[i]);

        // garage
        Item[] parking = {bike, bike, car, car, shelf, treadmill};
        for (i = 0; i < parking.length; i++)
            garage.addStuff(cuisine[i]);

        // house
        Room[] home = {kitchen, bedroom1, bedroom2, bathroom, livingRoom, garage};
        for (i = 0; i < home.length; i++)
            house.addRoom(home[i]);

        System.out.println(bedroom1);
    }
}