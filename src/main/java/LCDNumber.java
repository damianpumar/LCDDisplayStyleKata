public class LCDNumber {
    private final String top;
    private final String middle;
    private final String bottom;

    public LCDNumber(String top, String middle, String bottom) {
        this.top = top;
        this.middle = middle;
        this.bottom = bottom;
    }

    @Override
    public String toString() {
        return top + "\n" + middle + "\n" + bottom;
    }
}
