import java.util.ArrayList;

public class Adventure {
    //Loads classes
    Player dovakin;

    public Adventure() {
        Map adventureMap = new Map();
        adventureMap.createMap();
        dovakin = new Player(adventureMap.getFirstRoom());

    }

    public boolean moveN() {
        if (dovakin.moveNorth()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean moveS() {
        if (dovakin.moveSouth()) {
            return true;
        } else {
            return false;
        }
    }
    public boolean moveE() {
        if (dovakin.moveEast()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean moveW() {
        if (dovakin.moveWest()) {
            return true;
        } else {
            return false;
        }
    }

    public Room currentPos(){
        return dovakin.getCurrentRoom();
    }

}
