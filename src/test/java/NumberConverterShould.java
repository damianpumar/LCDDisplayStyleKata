import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NumberConverterShould {

    private NumberConverter numberConverter;

    @Before
    public void setup() {
        numberConverter = new NumberConverter();
    }

    @Test
    public void be_format_LCD_one() {
        assertThat(numberConverter.convert(1)).isEqualTo(" \n|\n|");
    }

    @Test
    public void be_format_LCD_two() {
        assertThat(numberConverter.convert(2)).isEqualTo(" _\n _|\n|_");
    }

    @Test
    public void be_format_LCD_twelve() {
        assertThat(numberConverter.convert(12)).isEqualTo("  _\n| _|\n||_");
    }
}
