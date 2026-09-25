public class UserInterface {
    Adventure adventure;
    public UserInterface(Adventure adventure) {
        this.adventure = adventure;
    }

    public void move() {

        boolean running = true;
        while (running) {

            String command = IO.readln("Input Command: ").trim().toLowerCase();

            //Takes input from room and position to change location or quit
            switch (command) {
                case "n" -> {
                    if (adventure.moveN()) {
                        IO.println("You move North");
                    } else {
                        invalidMove();
                    }
                }
                case "s" -> {
                    if (adventure.moveS()) {
                        IO.println("You move South");
                    } else {
                        invalidMove();
                    }
                }
                case "e" -> {
                    if (adventure.moveE()) {
                        IO.println("You move East");
                    } else {
                        invalidMove();
                    }
                }
                case "w" -> {
                    if (adventure.moveW()) {
                        IO.println("You move West");
                    } else {
                        invalidMove();
                    }
                }
                case "help" -> displayHelpMenu();
                case "exit" -> running = false;
                case "look" -> {
                    String descrition = ("You look and see that you are in " + adventure.currentPos());
                    if (running){
                        IO.println(descrition + "\n" + "A Item! Has Abillity!");
                        } else {
                        IO.println(descrition + "\n" + "There was no item found");
                        }
                }
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

