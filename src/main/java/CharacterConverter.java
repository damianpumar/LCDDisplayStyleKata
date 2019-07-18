public class CharacterConverter {
    private final NumberConverter numberConverter;
    private final LetterConverter letterConverter;

    public CharacterConverter() {
        this.numberConverter = new NumberConverter();

        this.letterConverter = new LetterConverter();
    }

    public String convert(int arabicNumber) {
        return this.numberConverter.convert(arabicNumber);
    }

    public String convert(String character) {
        return this.letterConverter.convert(character);
    }
}
