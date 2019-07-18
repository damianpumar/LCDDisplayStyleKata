import java.util.ArrayList;
import java.util.List;

public class NumberConverter {
    private final List<LCDNumber> LCDNumbers;

    public NumberConverter() {
        this.LCDNumbers = new ArrayList() {
            {
                add(new LCDNumber(" ", "|", "|"));
                add(new LCDNumber("_", "_|", "|_"));
            }
        };
    }

    public String convert(int arabicNumber) {
        LCDNumber LCDnumber = this.LCDNumbers.get(arabicNumber - 1);

        return LCDnumber.toString();
    }
}
