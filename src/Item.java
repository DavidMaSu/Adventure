public record Item(String type, String ability) {

    @Override
    public String toString() {
        return "A " + type + " It can do " + ability;
    }
}

