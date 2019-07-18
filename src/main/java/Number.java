public abstract class Number {
    private final int value;

    public Number(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }
}