void main() {
    IO.println("Hello group");
    Adventure adventure = new Adventure();
    UserInterface UI = new UserInterface(adventure);

    UI.move();
}