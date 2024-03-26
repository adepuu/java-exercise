package exercises.session5;

import com.adepuu.exercises.session5.Exercise1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Exercise1Test {

    @Test
    @DisplayName("Should return the highest number in an array with a single element")
    public void testSingleElementArray() {
        Exercise1 solution = new Exercise1();
        int[] input = {5};
        int expectedResult = 5;
        int result = solution.getHighestNumber(input);
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Should return the highest number in an array with multiple elements")
    public void testMultipleElementsArray() {
        Exercise1 solution = new Exercise1();
        int[] input = {1, 2, 3, 58, 47, 229, 40};
        int expectedResult = 229;
        int result = solution.getHighestNumber(input);
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Should return the highest number in an array with all elements being the same")
    public void testAllElementsSame() {
        Exercise1 solution = new Exercise1();
        int[] input = {10, 10, 10};
        int expectedResult = 10;
        int result = solution.getHighestNumber(input);
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Should return the highest number in an array with all elements being negative")
    public void testAllElementsNegative() {
        Exercise1 solution = new Exercise1();
        int[] input = {-10, -20, -30};
        int expectedResult = -10;
        int result = solution.getHighestNumber(input);
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Should return 0 for an empty array")
    public void testEmptyArray() {
        Exercise1 solution = new Exercise1();
        int[] input = {};
        int expectedResult = 0;
        int result = solution.getHighestNumber(input);
        Assertions.assertEquals(expectedResult, result);
    }
}
