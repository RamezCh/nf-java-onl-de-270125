import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestDrivenDevelopmentTest {

    @Test
    void FizzBuzz_ForThree_ReturnFizz() {
        // Given
        int a = 3;
        String expected = "Fizz";
        // When
        String actual = TestDrivenDevelopment.FizzBuzz(a);
        // Then
        assertEquals(expected, actual);
    }

    @Test
    void FizzBuzz_ForFive_ReturnBuzz() {
        // Given
        int a = 5;
        String expected = "Buzz";
        // When
        String actual = TestDrivenDevelopment.FizzBuzz(a);
        // Then
        assertEquals(expected, actual);
    }

    @Test
    void FizzBuzz_ForFifteen_ReturnFizzBuzz() {
        // Given
        int a = 15;
        String expected = "FizzBuzz";
        // When
        String actual = TestDrivenDevelopment.FizzBuzz(a);
        // Then
        assertEquals(expected, actual);
    }

    @Test
    void FizzBuzz_ForOne_ReturnOne() {
        // Given
        int a = 1;
        String expected = "1";
        // When
        String actual = TestDrivenDevelopment.FizzBuzz(a);
        // Then
        assertEquals(expected, actual);
    }
}
