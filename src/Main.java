void main() {
    IO.println("Hello group");
    Map map = new Map();
    Adventure adventure = new Adventure(map.createMap());
    UserInterface UI = new UserInterface(adventure);

    UI.move();
}

