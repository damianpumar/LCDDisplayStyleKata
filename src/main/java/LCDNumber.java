public class LCDNumber extends Number {
    private final String[] positions;

    public LCDNumber(int arabicNumber, String top, String middle, String bottom) {
        super(arabicNumber);

        this.positions = new String[]{top, middle, bottom};
    }

    public String value(Position position) {
        return this.positions[position.value()];
    }
}
