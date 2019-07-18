import java.util.ArrayList;
import java.util.List;

public class LetterConverter extends Converter<String> {
    @Override
    public String convert(String character) {
        this.formatter.add(this.getLCDCharacter(character));

        return this.formatter.format();
    }

    @Override
    protected List<Character> getLCDcharacters() {
        return new ArrayList() {
            {
                add(new LCDLetter("A", "  ^ ", " /_\\", "/   \\"));
            }
        };
    }
}
