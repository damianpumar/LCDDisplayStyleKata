public abstract class Character<T> {
    private final T value;
    private final String[] positions;

    protected Character(T value, String top, String middle, String bottom) {
        this.value = value;

        this.positions = new String[]{top, middle, bottom};
    }

    public T value() {
        return this.value;
    }

    public String value(Position position) {
        return this.positions[position.value()];
    }
}
