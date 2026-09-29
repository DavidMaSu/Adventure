public class Item {
    String type;
    String description;
    public Item(String type, String description){
        this.type = type;
        this.description = description;
    }


    @Override
    public String toString() {
        return "Item " + type + " " + description;
    }
}

