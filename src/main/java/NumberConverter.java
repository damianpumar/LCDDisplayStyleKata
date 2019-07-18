import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberConverter extends Converter<Integer> {

    @Override
    protected List<Character> getLCDcharacters() {
        return new ArrayList() {
            {
                add(new LCDNumber(1, " ", "|", "|"));
                add(new LCDNumber(2, " _", " _|", "|_"));
            }
        };
    }

    @Override
    public String convert(Integer arabicNumber) {
        for (int number : parseArabicNumbers(arabicNumber)) {
            this.formatter.add(getLCDCharacter(number));
        }

        return this.formatter.format();
    }

    private int[] parseArabicNumbers(int arabicNumber) {
        return Arrays.stream(String.valueOf(arabicNumber).split(""))
                .mapToInt(Integer::parseInt).toArray();
    }
}
