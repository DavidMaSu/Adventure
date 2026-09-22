public class Adventure {

    Room roomWest = new Room("Room West","Des");
    Room roomNorthWest = new Room("Room North West","Des");
    Room roomNorth = new Room("Room North","Des");
    Room roomNorthEast = new Room("Room North East","Des");
    Room roomEast = new Room("Room East","Des");
    Room roomSouthEast = new Room("Room South East","Des");
    Room roomSouth = new Room("Room South","Des");
    Room roomSouthWest = new Room("Room South West","Des");
    Room roomCentral = new Room("Room Central","Des");

    Position player = new Position(roomNorthWest);


    //Initiates Games from Main
    public void startAdventure () {
    boolean running = true;
        while (running){

            IO.println(player.whereIsPlayer());

            String command = IO.readln("Input Command: ");

            //Takes input from room and position to change location or quit
            switch (command){
                case "n" -> IO.println("You go North");
                case "s" -> IO.println("You go South");
                case "e" -> IO.println("You go East");
                case "w" -> IO.println("You go West");
                case "Help", "help" -> displayHelpMenu();
                case "exit" -> running = false;
                default -> IO.println("Invalid Command");
            }

        }
        IO.println("Exiting Program");
    }

    private void displayHelpMenu (){
        IO.println("Type n to go North");
        IO.println("Type s to go South");
        IO.println("Type e to go East");
        IO.println("Type w to go West");
        IO.println("Type Exit to quit");
    }
}

