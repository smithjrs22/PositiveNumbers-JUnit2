import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Nested;

import static org.junit.jupiter.api.Assertions.*;
@DisplayName("Testing to See if the Number Entered is Positive")
class PositiveNumbersTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }
    @Nested
    @DisplayName("Testing to see if the input will execute the method called")
    @org.junit.jupiter.api.Test
    void mainPrintoutIsNumPositive() {
        assertEquals("Number must be a positive number", PositiveNumbers.isNumberPositive(-5));
        assertEquals("Thanks for entering 5" , PositiveNumbers.isNumberPositive(5));
        assertEquals("Process finished with exit code 0", PositiveNumbers.isNumberPositive(0));
    }

    @Nested
    @DisplayName("Testing to see if number entered is positive. If number negative please enter negative. If 0 it will exit. If positive it will print thanks for entering positive number")
    @org.junit.jupiter.api.Test
    void isNumberPositive() {
        assertEquals("Number must be a positive number", PositiveNumbers.isNumberPositive(-5));
        assertEquals("Thanks for entering 50" , PositiveNumbers.isNumberPositive(50));
        assertEquals("Process finished with exit code 0", PositiveNumbers.isNumberPositive(0));
    }
}