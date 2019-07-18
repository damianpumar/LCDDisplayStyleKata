public enum Position {
    TOP(0),
    MIDDLE(1),
    BOTTOM(2);

    private final int position;

    Position(int position) {
        this.position = position;
    }

    public int value() {
        return this.position;
    }
}
