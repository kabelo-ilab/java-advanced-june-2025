package chapter9;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class DataStore {

    public static List<Integer> randomNumbers(){
        Random rnd = new Random();
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < rnd.nextInt(5, 10); i++) {//7
            numbers.add(rnd.nextInt(50, 100));//25
        }
        return numbers;
    }

    public static Stream<String> hobbies(){
        return Stream.of("Chess", "Soccer", "Tennis", "Hiking", "Swimming", "Golf");
    }
}
