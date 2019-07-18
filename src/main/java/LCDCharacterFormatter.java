import java.util.ArrayList;
import java.util.List;

public class LCDCharacterFormatter {
    private final List<Character> LCDCharacters;
    private final String NEW_LINE = "\n";

    public LCDCharacterFormatter() {
        this.LCDCharacters = new ArrayList();
    }

    public void add(Character lcdNumber) {
        this.LCDCharacters.add(lcdNumber);
    }

    public String format() {
        return createLine(Position.TOP) + NEW_LINE + createLine(Position.MIDDLE) + NEW_LINE + createLine(Position.BOTTOM);
    }

    private String createLine(Position position) {
        String formatted = "";

        for (Character number : this.LCDCharacters) {
            formatted += number.value(position);
        }

        System.out.println(formatted);

        return formatted;
    }
}
