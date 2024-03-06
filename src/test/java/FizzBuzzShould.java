import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzShould {
    @ParameterizedTest
    @CsvSource({
            "1, '1'",
            "2, '2'",
            "4, '4'",
            "7,'7'",
            "8, '8'",
            "11, '11'",
            "13, '13'",
            "14, '14'"
    })
    @DisplayName("return the given number")
    public void return_the_given_number(int number, String convertedNumber) {
        assertEquals(convertedNumber, FizzBuzz.convertToFizzBuzz(number));
    }

}
