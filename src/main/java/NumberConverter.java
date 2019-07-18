import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberConverter {
    private final LCDNumberFormatter formatter;
    private final List<LCDNumber> LCDNumbers;

    public NumberConverter() {
        this.formatter = new LCDNumberFormatter();

        this.LCDNumbers = new ArrayList() {
            {
                add(new LCDNumber(1, " ", "|", "|"));
                add(new LCDNumber(2, "_", "_|", "|_"));
            }
        };
    }

    public String convert(int arabicNumber) {

        for (int number : parseArabicNumbers(arabicNumber)) {
            this.formatter.add(getLCDNumber(number));
        }

        return this.formatter.format();
    }

    private LCDNumber getLCDNumber(int number) {
        return this.LCDNumbers.stream().filter(lcd -> lcd.value() == number)
                .findFirst()
                .get();
    }

    private int[] parseArabicNumbers(int arabicNumber) {
        return Arrays.stream(String.valueOf(arabicNumber).split(""))
                .mapToInt(Integer::parseInt).toArray();
    }
}
