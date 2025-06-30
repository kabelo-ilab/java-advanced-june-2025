package chapter9;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;


import static org.junit.jupiter.api.Assertions.*;

public class DataDrivenTests {

    /**
     * Test method with constant integer values
     * @param number number to be evaluated as an even number
     */
    @ParameterizedTest
    @ValueSource(ints = {12, 15, 3, 8, 10})
    void testEvenNumbers(int number){
        //Arrange
        int expected = 0;
        //Actual
        int actual = number % 2;
        //Assert
        assertEquals(expected, actual);

    }
    @ParameterizedTest
    @ValueSource(strings = {"Smith", "Tom", "John","Kate", "Jessica", "Carol"})
    void testStartsWithJ(String name){
        //Assert
        assertTrue(name.startsWith("J"));
    }

    @ParameterizedTest
    @CsvSource(value =
            {"Tom,25,1.7,true", "Caroline,36,1.63,true", "Roger,30,1.77,false"})
    void testEmployed(String name, int age, double height, boolean isEmployed){

        System.out.println("name = " + name + ", age = " + age + ", height = " +
                height + ", isEmployed = " + isEmployed);
        //Assert

        assertAll(
                () -> assertTrue(age > 30),
                () -> assertTrue(isEmployed));
    }

    @ParameterizedTest
    @MethodSource("hobbies")
    void testHobbies(String hobby){
        System.out.println("hobby = " + hobby);

    }

    @ParameterizedTest
    @MethodSource("randomNumbers")
    void testRandomNumbers(int number){
        System.out.println("number = " + number);
    }

    @ParameterizedTest
    @MethodSource("chapter9.DataStore#randomNumbers")
    void testRandomNumberFromDataStore(int num){
        System.out.println("num = " + num);
    }

    static List<Integer> randomNumbers(){
        Random rnd = new Random();
        List<Integer> numbers = new ArrayList<>();
        int count = rnd.nextInt(5, 10);//8

        for (int i = 0; i < count; i++) {
            numbers.add(rnd.nextInt(5, 50));
        }
        return numbers;
    }

    static Stream<String> hobbies(){
        return Stream.of("Tennis", "Soccer", "Chess", "Hiking");
    }

}
