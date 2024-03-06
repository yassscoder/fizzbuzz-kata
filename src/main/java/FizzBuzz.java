import static java.lang.String.valueOf;

class FizzBuzz {
    public static String convertToFizzBuzz(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        }
        return valueOf(number);
    }
}
