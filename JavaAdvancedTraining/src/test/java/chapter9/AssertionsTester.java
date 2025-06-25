package chapter9;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTester {
    @Test
    @DisplayName("Test the sum of 2 integers")
    void testSum(){
        /*Arrange - define  initial / expected values*/
        int number1 = 5;
        int number2 = 1;
        int expected = 6;

        /*Actual - the system should produce the actual results*/
        int actual = number1 + number2 + 1;

        /*Assert - compare actual results with the expected results*/
        assertEquals(expected, actual, "The sum of " + number1 + " + " + number2 + " should be: " + expected);
    }

    @Test
    void testAssertions(){
        //Arrange
        String name1 = "Tom";
        String name2 = "Tom";
        int age = 25;
        String text = null;
        int[] numbers = {2, 5, 9};
        int[] numbers2 = {3, 5, 9};

        //Assert
        assertEquals(name1, name2);//fail
        assertEquals(null, text);//pass
        assertTrue(age % 2 == 0);//fail
        assertNull(text);//pass
        assertNotNull(text);//fail
        assertSame(text, name1);//pass
        assertArrayEquals(numbers, numbers2);//fail
    }
    @Test
    @DisplayName("Test Multiple Assertions")
    void testMultipleAssertions(){
        //Arrange
        String name1 = "Tom";
        String name2 = "tom";
        int age = 25;
        String text = "nothing";
        int[] numbers = {2, 5, 9};
        int[] numbers2 = {2, 5, 9};

        //Assert
        assertAll(
                () -> assertEquals(name1, name2),
                () -> assertEquals(null, text),
                () -> assertTrue(age % 2 == 0),
                () -> assertNull(text),
                () -> assertNotNull(text),
                () -> assertSame(text, name1),
                () -> assertArrayEquals(numbers, numbers2)
        );

    }

}
