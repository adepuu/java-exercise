package exercises.session5;

import com.adepuu.exercises.session5.Exercise3BruteForce;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Exercise3BruteForceTest {

    @Test
    @DisplayName("Check for duplicates in an empty array")
    void testEmptyArray() {
        Exercise3BruteForce solution = new Exercise3BruteForce();
        int[] input = {};
        assertFalse(solution.checkDuplicates(input));
    }

    @Test
    @DisplayName("Check for duplicates in a single-element array")
    void testSingleElementArray() {
        Exercise3BruteForce solution = new Exercise3BruteForce();
        int[] input = {1};
        assertFalse(solution.checkDuplicates(input));
    }

    @Test
    @DisplayName("Check for duplicates in an array with unique elements")
    void testUniqueElementsArray() {
        Exercise3BruteForce solution = new Exercise3BruteForce();
        int[] input = {1, 2, 3, 4, 5};
        assertFalse(solution.checkDuplicates(input));
    }

    @Test
    @DisplayName("Check for duplicates in an array with duplicate elements")
    void testDuplicateElementsArray() {
        Exercise3BruteForce solution = new Exercise3BruteForce();
        int[] input = {1, 2, 3, 2, 5};
        assertTrue(solution.checkDuplicates(input));
    }

    @Test
    @DisplayName("Check for duplicates in a large array")
    void testLargeArray() {
        Exercise3BruteForce solution = new Exercise3BruteForce();
        int[] input = new int[10000];
        for (int i = 0; i < input.length; i++) {
            input[i] = i;
        }
        assertFalse(solution.checkDuplicates(input));
    }

    @Test
    @DisplayName("Check for duplicates in an array with negative numbers")
    void testNegativeNumbersArray() {
        Exercise3BruteForce solution = new Exercise3BruteForce();
        int[] input = {-1, -2, -3, -4, -5};
        assertFalse(solution.checkDuplicates(input));
    }

    @Test
    @DisplayName("Check for duplicates in an array with mixed positive and negative numbers")
    void testMixedPositiveAndNegativeNumbersArray() {
        Exercise3BruteForce solution = new Exercise3BruteForce();
        int[] input = {1, -2, 3, -4, 5};
        assertFalse(solution.checkDuplicates(input));
    }
}
