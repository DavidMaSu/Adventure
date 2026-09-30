public class UserInterface {
    Adventure adventure;
    Item sword = new Item("sword", "cool");

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
                    if (adventure.playerMove("n")) {
                        IO.println("You move North");
                    } else {
                        invalidMove();
                    }
                }
                case "s" -> {
                    if (adventure.playerMove("s")) {
                        IO.println("You move South");
                    } else {
                        invalidMove();
                    }
                }
                case "e" -> {
                    if (adventure.playerMove("e")) {
                        IO.println("You move East");
                    } else {
                        invalidMove();
                    }
                }
                case "w" -> {
                    if (adventure.playerMove("w")) {
                        IO.println("You move West");
                    } else {
                        invalidMove();
                    }
                }
                case "health" -> IO.println("Your health is " + adventure.displayPlayerHealth());
                case "take" -> {
                    String name = IO.readln("What do you wanna take? ").trim().toLowerCase();
                    //Takes string name item
                    Item playerItem = adventure.addItem(name);
                    IO.println("Added: " + playerItem + " to inventory!");
                    //Debug test to see if items goes to inventory
                    IO.println(adventure.dovakin.getInventory());
                }
                case "drop" -> {
                    String name = IO.readln("What do you wanna drop? ").trim().toLowerCase();
                    //Drops string name item
                    Item item = adventure.dropItem(name);
                    IO.println("You have dropped!: " + item);
                }
                case "eat" -> {
                    String itemNameToEat = IO.readln("What do you want to eat? ").trim().toLowerCase();
                    EatResult result = adventure.playerEat(itemNameToEat);
                    switch (result) {
                        case EATEN -> IO.println("You ate " + itemNameToEat);
                        case NOT_FOUND -> IO.println("There is no such item");
                        case NOT_FOOD -> IO.println("You can't eat " + itemNameToEat + " you bozo.");
                        default -> IO.println("Error in item handling, EatResult did not return enum value");
                    }

                }
                case "drink" -> {
                    String itemNameToDrink = IO.readln("What do you want to drink? ").trim().toLowerCase();
                    DrinkResult result = adventure.playerDrink(itemNameToDrink);
                    switch (result) {
                        case DRANK -> IO.println("You drank " + itemNameToDrink);
                        case NOT_FOUND -> IO.println("There is no such item");
                        case NOT_DRINKABLE -> IO.println("You can't drink " + itemNameToDrink + " you bozo.");
                        default -> IO.println("Error in item handling, EatResult did not return enum value");
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

