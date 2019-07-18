import java.util.List;

public abstract class Converter<T> {
    protected final LCDCharacterFormatter formatter;
    private final List<Character> LCDcharacters;

    protected Converter() {
        this.formatter = new LCDCharacterFormatter();

        this.LCDcharacters = this.getLCDcharacters();
    }

    protected Character<T> getLCDCharacter(T character) {
        return this.LCDcharacters.stream().filter(lcd -> lcd.value() == character)
                .findFirst()
                .get();
    }

    protected abstract List<Character> getLCDcharacters();

    public abstract String convert(T character);
}
