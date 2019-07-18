import java.util.ArrayList;
import java.util.List;

public class LCDNumberFormatter {
    private final List<LCDNumber> LCDNumbers;

    public LCDNumberFormatter() {
        this.LCDNumbers = new ArrayList();
    }

    public void add(LCDNumber lcdNumber) {
        this.LCDNumbers.add(lcdNumber);
    }

    public String format() {
        return createLine(0) + "\n" + createLine(1) + "\n" + createLine(2);
    }

    private String createLine(int position) {
        String formatted = "";

        for (LCDNumber number : this.LCDNumbers) {
            formatted += number.getPosition(position);
        }

        return formatted;
    }
}
