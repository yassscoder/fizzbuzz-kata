import static java.lang.String.valueOf;

class FizzBuzz {
    public static String convertToFizzBuzz(int number) {
        String converted = "";
        if (number % 3 == 0) {
            converted += "Fizz";
        }
        if (number % 5 == 0) {
            converted += "Buzz";
        }
        if (converted.isBlank()) {
            converted = valueOf(number);
        }
        return converted;
    }
}
