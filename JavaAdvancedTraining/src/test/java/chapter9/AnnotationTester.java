package chapter9;

import org.junit.jupiter.api.*;

public class AnnotationTester {
     static String[] names;
    @BeforeAll
   static void setup(){
        names = new String[]{
                "James", "Tom", "Paul",
                "Jessica", "Carol"
        };
    }

    @Test
    @DisplayName("Normal Test Method")
    void normalTestMethod(){
        System.err.println("Array Size: " + names.length);
        System.out.println("Just a normal test method");
    }

    @BeforeEach
    void executeBeforeEach(){
        names[1] = "Tom Smith";
        System.out.println("Before Each executed...");
    }

    @AfterEach
    void executeAfterEach(){
        for (int i = 0; i < names.length; i++) {
            System.err.print(names[i] + "  ");
        }
        System.out.println("==============================");
    }

    @Test
    @DisplayName("Another Normal Test Method")
    void executeTest(){
        System.out.println("Test Method executed...");
    }

    @AfterAll
    static void tearDown(){
        System.out.println("All done....");
    }
}
