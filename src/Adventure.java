public class Adventure {

    //Initiates Games from Main
    public void startAdventure () {
    boolean running = true;
        while (running){

            //Display current position
            //PLACEHOLDER

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

