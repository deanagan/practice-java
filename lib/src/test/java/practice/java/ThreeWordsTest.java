/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package practice.java;

import org.testng.annotations.*;
import static org.testng.Assert.*;

public class ThreeWordsTest {

    @DataProvider(name = "three words test")
    public static Object[][] testParameters() {
       return new Object[][] {
        {"Hello World hello", true},
        // {"He is 123 man", false},
        // {"1 2 3 4", false},
        // {"bla bla bla bla", true},
        // {"Hi", false}
        };
    }

    @Test(dataProvider = "three words test")
    public void someLibraryMethodReturnsTrue(String input, boolean expected) {
        var sut = new ThreeWords();

        assertEquals(expected, sut.hasThreeWordsConsecutive(input));
    }
}
