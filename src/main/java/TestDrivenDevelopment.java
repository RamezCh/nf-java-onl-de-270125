public class TestDrivenDevelopment {
    public static void main(String[] args) {

    }

    public static String FizzBuzz(int a) {
        if (a % 3 == 0 && a % 5 == 0) {
            return "FizzBuzz";
        }
        if (a % 3 == 0) {
            return "Fizz";
        }
        if (a % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(a);
    }
}
