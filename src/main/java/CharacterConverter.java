import java.util.ArrayList;
import java.util.List;

public class CharacterConverter {
    protected final LCDCharacterFormatter formatter;
    private final List<Character> LCDcharacters;

    public CharacterConverter() {
        this.formatter = new LCDCharacterFormatter();

        this.LCDcharacters = new ArrayList() {
            {
                add(new Character("1", " ", "|", "|"));
                add(new Character("2", " _", " _|", "|_"));
                add(new Character("A", " __ ", "|__|", "|  |"));
            }
        };
    }

    public String convert(String characters) {
        for (String character : characters.split("")) {
            this.formatter.add(getLCDCharacter(character));
        }

        return this.formatter.format();
    }

    private Character getLCDCharacter(String character) {
        return this.LCDcharacters.stream().filter(lcd -> lcd.value().equals(character))
                .findFirst()
                .get();
    }
}
