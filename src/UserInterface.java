public class UserInterface {
    Adventure adventure;
    Item sword = new Item("sword", "cool", 1);

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
                    if (adventure.playerMove(north)) {
                        IO.println("You move North");
                    } else {
                        invalidMove();
                    }
                }
                case "s" -> {
                    if (adventure.playerMove(south)) {
                        IO.println("You move South");
                    } else {
                        invalidMove();
                    }
                }
                case "e" -> {
                    if (adventure.playerMove(east)) {
                        IO.println("You move East");
                    } else {
                        invalidMove();
                    }
                }
                case "w" -> {
                    if (adventure.playerMove(west)) {
                        IO.println("You move West");
                    } else {
                        invalidMove();
                    }
                }
                case "health" -> IO.println("Your health is " +adventure.displayHealth());
                case "take" -> {
                    String name = IO.readln("What do you wanna take? ");
                    //Takes string name item
                    Item playerItem = adventure.addItem(name);
                    IO.println("Added: " + playerItem + " to inventory!");
                    //Debug test to see if items goes to inventory
                    IO.println(adventure.dovakin.getInventory());
                }
                case "drop" -> {
                    String name = IO.readln("What do you wanna drop? ");
                    //Drops string name item
                    Item item = adventure.dropItem(name);
                    IO.println("You have dropped!: " + item);
                }
                case "eat" -> {
                    String name = IO.readln("What do you wanna take? ");
                if (adventure.playerHasItems(name) || adventure.roomHasItems())
                    if (name instanceof Food) {
                    adventure.eat(name);
                    IO.print("You ate " + name);
                    }; else {
                        IO.println("You can't eat this.");
                    }

                }
                case "i" -> {
                    if (adventure.playerHasItems()) {
                        IO.println("You are carrying:");
                        IO.println(adventure.playerDisplayItems());
                    } else {
                        IO.println("You are not carrying anything.");
                    }
                }
                case "help" -> displayHelpMenu();
                case "exit" -> running = false;
                case "look" -> {
                    String description = ("You look and see that you are in " + adventure.currentPos());
                    if (adventure.hasItems()) {
                        IO.println(description + "\n" + "Here you see: " + adventure.displayItems());
                    } else {
                        IO.println(description + "\n" + "There is nothing here");
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
        IO.println("Type i to check your inventory");
        IO.println("Type health to check your status");
        IO.println("Type eat to eat something in your inventory or room");
        IO.println("Type take to take item");
        IO.println("Type drop to drop item");
        IO.println("Type look to see room");
        IO.println("Type Exit to quit");
    }

    private void invalidMove() {
        IO.println("You cannot move in this direction");
    }
}

