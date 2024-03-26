package exercises.session5;

import com.adepuu.exercises.session5.Exercise2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Exercise2Test {

    @Test
    @DisplayName("Should rotate an array with a single element by 1 position")
    public void testSingleElementArrayRotation() {
        Exercise2 solution = new Exercise2();
        int[] input = {5};
        int[] expectedResult = {5};
        int shiftPosition = 1;

        solution.rotateLeft(input, shiftPosition);
        Assertions.assertArrayEquals(expectedResult, input);
    }

    @Test
    @DisplayName("Should rotate an array with multiple elements by 2 positions")
    public void testMultipleElementsArrayRotation() {
        Exercise2 solution = new Exercise2();
        int[] input = {1, 2, 3, 4, 5};
        int[] expectedResult = {3, 4, 5, 1, 2};
        int shiftPosition = 2;

        solution.rotateLeft(input, shiftPosition);
        Assertions.assertArrayEquals(expectedResult, input);
    }

    @Test
    @DisplayName("Should rotate an array with all elements being the same by 3 positions")
    public void testAllElementsSameRotation() {
        Exercise2 solution = new Exercise2();
        int[] input = {10, 10, 10, 10, 10};
        int[] expectedResult = {10, 10, 10, 10, 10};
        int shiftPosition = 3;

        solution.rotateLeft(input, shiftPosition);
        Assertions.assertArrayEquals(expectedResult, input);
    }

    @Test
    @DisplayName("Should rotate an array with all elements being negative by 4 positions")
    public void testAllElementsNegativeRotation() {
        Exercise2 solution = new Exercise2();
        int[] input = {-10, -20, -30, -40, -50};
        int[] expectedResult = {-50, -10, -20, -30, -40};
        int shiftPosition = 4;

        solution.rotateLeft(input, shiftPosition);
        Assertions.assertArrayEquals(expectedResult, input);
    }

    @Test
    @DisplayName("Should not change an empty array when rotated by 0 positions")
    public void testEmptyArrayRotation() {
        Exercise2 solution = new Exercise2();
        int[] input = {};
        int[] expectedResult = {};
        int shiftPosition = 0;

        solution.rotateLeft(input, shiftPosition);
        Assertions.assertArrayEquals(expectedResult, input);
    }
}
