import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CharacterConverterShould {

    private CharacterConverter characterConverter;

    @Before
    public void setup() {
        characterConverter = new CharacterConverter();
    }

    @Test
    public void be_format_LCD_one() {
        assertThat(characterConverter.convert(1)).isEqualTo(" \n|\n|");
    }

    @Test
    public void be_format_LCD_two() {
        assertThat(characterConverter.convert(2)).isEqualTo(" _\n _|\n|_");
    }

    @Test
    public void be_format_LCD_twelve() {
        assertThat(characterConverter.convert(12)).isEqualTo("  _\n| _|\n||_");
    }

    @Test
    public void be_format_LCD_A() {
        assertThat(characterConverter.convert("A")).isEqualTo("  ^ \n /_\\\n/   \\");
    }
}
