public class LCDNumber {
    private final String[] positions;

    public LCDNumber(String top, String middle, String bottom) {
        this.positions = new String[]{top, middle, bottom};
    }

    public String getPosition(int position) {
        return this.positions[position];
    }
}
