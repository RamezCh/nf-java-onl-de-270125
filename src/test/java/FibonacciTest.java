import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FibonacciTest {
    @Test
    void Fibonnaci_BaseCase_ReturnOne() {
        int a = 1;
        int expected = 1;
        int actual = Fibonacci.calculate(a);
        assertEquals(expected, actual);
    }

    @Test
    void Fibonnaci_givenThree_returnTwo() {
        int a = 3;
        int expected = 2;
        int actual = Fibonacci.calculate(a);
        assertEquals(expected, actual);
    }

    @Test
    void Fibonnaci_givenFour_returnThree() {
        int a = 4;
        int expected = 3;
        int actual = Fibonacci.calculate(a);
        assertEquals(expected, actual);
    }

    @Test
    void Fibonnaci_givenEight_returnTwentyOne() {
        int a = 8;
        int expected = 21;
        int actual = Fibonacci.calculate(a);
        assertEquals(expected, actual);
    }
}
