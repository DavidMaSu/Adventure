public class UserInterface {
    Player player;

    public UserInterface(Player player) {
        this.player = player;
    }

    public void move(Player player) {

        boolean running = true;
        while (running) {

            String command = IO.readln("Input Command: ").trim().toLowerCase();

            //Takes input from room and position to change location or quit
            switch (command) {
                case "n" -> {
                    if (player.moveNorth()) {
                        IO.println("You move North");
                    } else {
                        invalidMove();
                    }
                }
                case "s" -> {
                    if (player.moveSouth()) {
                        IO.println("You move South");
                    } else {
                        invalidMove();
                    }
                }
                case "e" -> {
                    if (player.moveEast()) {
                        IO.println("You move East");
                    } else {
                        invalidMove();
                    }
                }
                case "w" -> {
                    if (player.moveWest()) {
                        IO.println("You move West");
                    } else {
                        invalidMove();
                    }
                }
                case "help" -> displayHelpMenu();
                case "exit" -> running = false;
                case "look" -> IO.println("You look and see that you are in " + player.getCurrentRoom());
                default -> IO.println("Invalid Command");
            }

        }
        IO.println("Exiting Program");
    }

    private void displayHelpMenu() {
        IO.println("Type n to go North");
        IO.println("Type s to go South");
        IO.println("Type e to go East");
        IO.println("Type w to go West");
        IO.println("Type look to see room");
        IO.println("Type Exit to quit");
    }

    private void invalidMove() {
        IO.println("You cannot move in this direction");
    }
}

