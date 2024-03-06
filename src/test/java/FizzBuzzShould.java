import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzShould {
    @Test
    @DisplayName("return the given number")
    public void return_the_given_number(){
        assertEquals("1",FizzBuzz.convertToFizzBuzz(1));
    }


    private static class FizzBuzz {
        public static String convertToFizzBuzz(int number) {
            return null;
        }
    }
}
