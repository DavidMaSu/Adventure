import java.util.ArrayList;
public class Map {


    //Egentlig kunne man godt bare have dette som metode men
    public Room createMap() {

        Room roomWest = new Room("Room West", "Des");
        Room roomNorthWest = new Room("Room North West", "Des");
        Room roomNorth = new Room("Room North", "Des");
        Room roomNorthEast = new Room("Room North East", "Des");
        Room roomEast = new Room("Room East", "Des");
        Room roomSouthEast = new Room("Room South East", "Des");
        Room roomSouth = new Room("Room South", "Des");
        Room roomSouthWest = new Room("Room South West", "Des");
        Room roomCentral = new Room("Room Central", "Des");


        roomWest.     setAdjacentRooms(roomNorthWest, null,          roomSouthWest, null);
        roomNorthWest.setAdjacentRooms(null,          roomNorth,     roomWest,      null);
        roomNorth.    setAdjacentRooms(null,          roomNorthEast, null,          roomNorthWest);
        roomNorthEast.setAdjacentRooms(null,          null,          roomEast,      roomNorth);
        roomEast.     setAdjacentRooms(roomNorthEast, null,          roomSouthEast, null);
        roomSouthEast.setAdjacentRooms(roomEast,      null,          null,          roomSouth);
        roomSouth.    setAdjacentRooms(roomCentral,   roomSouthEast, null,          roomSouthWest);
        roomSouthWest.setAdjacentRooms(roomWest,      roomSouth,     null,          null);
        roomCentral.  setAdjacentRooms(null,          null,          roomSouth,     null);


        Room firstRoom = roomNorthWest;

        Item spoon = new Item("Spoon","A common spoon, new very dangerous");
        Item pot = new Item("Pot", "but it doesnt hold any soup");
        Item flashLight = new Item("Flashlight", "Never runs out of battery!");

        Food bread = new Food("Bread", "A loaf of stale bread", 10);
        Food goldenCarrot = new Food("Golden Carrot", "Carrot covered in gold", 90);
        Food suspiciousStew = new Food("Suspicious stew", "A stew that smells amazing", -50);

        RangedWeapon lasgun = new RangedWeapon("Lasgun", "A highly dangerous laser gun", 100, 1);
        MeleeWeapon blade = new MeleeWeapon("Blade", "A typical sword", 20);
        MeleeWeapon crysknife = new MeleeWeapon("Crysknife", "A knife with a blade made from the tooth of a Shaihulud", 60);
        MeleeWeapon claws = new MeleeWeapon("Claws", "sharp claws from animals", 15);

        Liquid water = new Liquid("Water", "Nice cold water", 10);
        Liquid swampWater = new Liquid("Swamp water", "Suspicious looking water", -20);
        Liquid cocaCola = new Liquid("Coca Cola", "A glass bottle of coca cola", 40);

        // mangler weapon
        Enemy dragon = new Enemy("Dragon ", 200, "A gigantic red, scaly creature of myth brought to life.", lasgun);
        Enemy racoon = new Enemy("Racoon", 5, "Small, furry, and dangerous.", claws);
        Enemy goblin = new Enemy("Goblin", 50,"Skinny humanoid with pale skin and red oval eyes.", blade);
        Enemy demon = new Enemy("Deamon", 100, "Tall dark like a shadow, as dangerous as devious", crysknife);
        Enemy devil = new Enemy("Devil", 150,"Blue-skinned, horned, with sharp teeth and venomous fangs.", claws);
        Enemy zombie = new Enemy("Zombie", 80, "Decomposing humans, moving and growing", blade);

        roomNorthWest.addItem(spoon);
        roomNorthWest.addItem(pot);
        roomNorth.addItem(flashLight);

        roomEast.addItem(bread);
        roomNorthWest.addItem(goldenCarrot);
        roomNorth.addItem(suspiciousStew);

        roomCentral.addItem(water);
        roomNorthWest.addItem(swampWater);
        roomNorth.addItem(cocaCola);

        roomSouthWest.addItem(lasgun);
        roomCentral.addItem(crysknife);
        roomNorthWest.addItem(blade);
        roomNorth.addItem(claws);

        roomCentral.addEnemy(dragon);
        roomNorthEast.addEnemy(racoon);
        roomNorth.addEnemy(goblin);
        roomSouthEast.addEnemy(demon);
        roomSouth.addEnemy(devil);
        roomSouthWest.addEnemy(zombie);

        return firstRoom;
    }
}
