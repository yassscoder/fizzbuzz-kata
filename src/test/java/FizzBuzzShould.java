import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzShould {
    @ParameterizedTest(name = "[{index}] {arguments}")
    @CsvSource(useHeadersInDisplayName = true, textBlock = """
                    number,         convertedNumber
                    1,              1
                    2,              2
                    4,              4
                    7,              7
                    8,              8
                    11,             11
                    13,             13
                    14,             14
            """)
    @DisplayName("return the given number")
    public void return_the_given_number(int number, String convertedNumber) {
        assertEquals(convertedNumber, FizzBuzz.convertToFizzBuzz(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9, 12})
    @DisplayName("return fizz")
    public void return_fizz(int number) {
        assertEquals("Fizz", FizzBuzz.convertToFizzBuzz(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10})
    @DisplayName("return buzz")
    public void return_buzz(int number) {
        assertEquals("Buzz", FizzBuzz.convertToFizzBuzz(number));
    }
    @ParameterizedTest
    @ValueSource(ints = {15, 30})
    @DisplayName("return FizzBuzz")
    public void return_fizzbuzz(int number) {
        assertEquals("FizzBuzz", FizzBuzz.convertToFizzBuzz(number));
    }

}
