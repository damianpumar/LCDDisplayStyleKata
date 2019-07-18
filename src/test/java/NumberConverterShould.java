import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NumberConverterShould {
    @Test
    public void be_format_LCD_one() {
        NumberConverter numberConverter = new NumberConverter();

        assertThat(numberConverter.convert(1)).isEqualTo(" \n|\n|");
    }
}
