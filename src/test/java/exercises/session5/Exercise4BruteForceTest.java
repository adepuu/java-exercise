package exercises.session5;

import com.adepuu.exercises.session5.Exercise4BruteForce;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Exercise4BruteForceTest {
    @DisplayName("Given an array with duplicates, when removing duplicates, then return array with unique elements")
    void testRemoveDuplicates() {
        Exercise4BruteForce solution = new Exercise4BruteForce();
        int[] input = {1, 2, 2, 3, 4, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, solution.removeDuplicates(input));
    }

    @Test
    @DisplayName("Given an array without duplicates, when removing duplicates, then return the same array")
    void testNoDuplicates() {
        Exercise4BruteForce solution = new Exercise4BruteForce();
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, solution.removeDuplicates(input));
    }

    @Test
    @DisplayName("Given an empty array, when removing duplicates, then return an empty array")
    void testEmptyArray() {
        Exercise4BruteForce solution = new Exercise4BruteForce();
        int[] input = {};
        int[] expected = {};
        assertArrayEquals(expected, solution.removeDuplicates(input));
    }

    @Test
    @DisplayName("Given an array with all elements being the same, when removing duplicates, then return an array with one element")
    void testAllSameElements() {
        Exercise4BruteForce solution = new Exercise4BruteForce();
        int[] input = {2, 2, 2, 2, 2};
        int[] expected = {2};
        assertArrayEquals(expected, solution.removeDuplicates(input));
    }

    @Test
    @DisplayName("Given an array with negative numbers, when removing duplicates, then return array with unique elements")
    void testNegativeNumbers() {
        Exercise4BruteForce solution = new Exercise4BruteForce();
        int[] input = {-1, -2, -2, -3, -4, -4, -5};
        int[] expected = {-1, -2, -3, -4, -5};
        assertArrayEquals(expected, solution.removeDuplicates(input));
    }
}
