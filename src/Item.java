public record Item(String type, String description, int ID) {

    @Override
    public String toString() {
        return "Item " + type + " " + description;
    }
}

