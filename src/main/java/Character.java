public class Character {
    private final String value;
    private final String[] positions;

    protected Character(String value, String top, String middle, String bottom) {
        this.value = value;

        this.positions = new String[]{top, middle, bottom};
    }

    public String value() {
        return this.value;
    }

    public String value(Position position) {
        return this.positions[position.value()];
    }
}
