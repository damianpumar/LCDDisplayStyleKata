import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CharacterConverter {
    private final LCDCharacterFormatter formatter;
    private final List<Character> LCDcharacters;

    public CharacterConverter() {
        this.formatter = new LCDCharacterFormatter();

        this.LCDcharacters = new ArrayList() {
            {
                add(new LCDNumber(1, " ", "|", "|"));
                add(new LCDNumber(2, " _", " _|", "|_"));
                add(new LCDLetter("A", "  ^ ", " /_\\", "/   \\"));
            }
        };
    }

    public String convert(int arabicNumber) {

        for (int number : parseArabicNumbers(arabicNumber)) {
            this.formatter.add(getLCDCharacter(number));
        }

        String lcdNumber = this.formatter.format();

        System.out.println(lcdNumber);

        return lcdNumber;
    }

    private <T> Character<T> getLCDCharacter(T number) {
        return this.LCDcharacters.stream().filter(lcd -> lcd.value() == number)
                .findFirst()
                .get();
    }

    private int[] parseArabicNumbers(int arabicNumber) {
        return Arrays.stream(String.valueOf(arabicNumber).split(""))
                .mapToInt(Integer::parseInt).toArray();
    }

    public String convert(String character) {
        this.formatter.add(this.getLCDCharacter(character));

        String letter = this.formatter.format();

        System.out.println(letter);

        return letter;
    }
}
