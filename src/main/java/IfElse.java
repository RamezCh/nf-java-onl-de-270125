public class IfElse {
    public static void main(String[] args) {
        int a = 5, b = 6;
        System.out.println("The sum of " + a + " and " + b + " is: " + addTwoNumbers(a, b));
        float floatA = 5.5f, floatB = 6.6f;
        System.out.println("The sum of " + floatA + " and " + floatB + " is: " + addTwoNumbers(floatA, floatB));
        System.out.println("The subtraction of " + a + " and " + b + " is: " + subtractTwoNumbers(a, b));
        System.out.println("I command thee " + -25 + ", become positive. " + makePositive(-25));
        if (a > b) {
            System.out.println("The sum of " + a + " and " + b + " is: " + addTwoNumbers(a, b));
        } else {
            System.out.println("The subtraction of " + a + " and " + b + " is: " + subtractTwoNumbers(a, b));
        }
        System.out.println("Welcome to the Even only Club. " + evenOnlyClub(3));
        System.out.println("Welcome to the Even only Club. " + evenOnlyClub(2));

        System.out.println("Testing palindrome for the word racecar: " + isPalindrome("racecar"));
        System.out.println("Testing palindrome for the word level: " + isPalindrome("level"));
        System.out.println("Testing palindrome for the word java: " + isPalindrome("java"));
        System.out.println("Testing palindrome for the word coding: " + isPalindrome("coding"));
        System.out.println("Testing palindrome for the word aba: " + isPalindrome("aba"));
        System.out.println("Testing palindrome for the word abba: " + isPalindrome("abba"));

    }

    public static int addTwoNumbers(int a, int b) {
        return a + b;
    }

    public static float addTwoNumbers(float a, float b) {
        return a + b;
    }

    public static int subtractTwoNumbers(int a, int b) {
        return a - b;
    }

    public static int makePositive(int num) {
        return num > 0 ? num : -num;
    }

    public static int evenOnlyClub(int num) {
        return num % 2 == 0 ? num : num * 2;
    }

    public static boolean isPalindrome(String text) {

        if (text == null || text.isEmpty()) {
            return true;
        }

        String cleanedText = text.trim().toLowerCase();

        int startIndex = 0, endIndex = cleanedText.length() - 1;

        while (startIndex < endIndex) {
            if (cleanedText.charAt(startIndex) != cleanedText.charAt(endIndex)) {
                return false;
            }
            startIndex++;
            endIndex--;
        }

        return true;
    }


}
