import java.util.ArrayList;

public class Adventure {
    //Loads classes
    Map adventureMap = new Map();
    Player dovakin = new Player(adventureMap);
    UserInterface UI = new UserInterface(dovakin);

    //Initiates Games from Main
    public void startAdventure() {
        //Assigning Room Adjacencies format - (North, East, South, West)
        adventureMap.createMap();
        UI.move(dovakin);
    }
}
