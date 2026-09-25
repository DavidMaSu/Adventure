void main() {
    Item sword = new Item("sword", "cool", 1);
    IO.println("Hello group");
    Adventure adventure = new Adventure(sword);
    UserInterface UI = new UserInterface(adventure);

    UI.move();
}