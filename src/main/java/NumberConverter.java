import java.util.ArrayList;
import java.util.List;

public class NumberConverter {
    private LCDNumberFormatter formatter;
    private final List<LCDNumber> LCDNumbers;

    public NumberConverter() {
        formatter = new LCDNumberFormatter();

        this.LCDNumbers = new ArrayList() {
            {
                add(new LCDNumber(" ", "|", "|"));
                add(new LCDNumber("_", "_|", "|_"));
            }
        };
    }

    public String convert(int arabicNumber) {

        for (String number : String.valueOf(arabicNumber).split("")) {
            formatter.add(this.LCDNumbers.get(Integer.parseInt(number) - 1));
        }

        return formatter.format();
    }
}
