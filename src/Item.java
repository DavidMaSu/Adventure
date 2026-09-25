public record Item(String type, String ability) {

    @Override
    public String toString() {
        return "en " + type + " taske. Den kan " + ability;
    }
}

