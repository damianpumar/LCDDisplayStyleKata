import java.util.ArrayList;
import java.util.List;

public class LCDNumberFormatter {
    private final List<LCDNumber> LCDNumbers;
    private final String NEW_LINE = "\n";

    public LCDNumberFormatter() {
        this.LCDNumbers = new ArrayList();
    }

    public void add(LCDNumber lcdNumber) {
        this.LCDNumbers.add(lcdNumber);
    }

    public String format() {
        return createLine(Position.TOP) + NEW_LINE + createLine(Position.MIDDLE) + NEW_LINE + createLine(Position.BOTTOM);
    }

    private String createLine(Position position) {
        String formatted = "";

        for (LCDNumber number : this.LCDNumbers) {
            formatted += number.value(position);
        }

        return formatted;
    }
}
