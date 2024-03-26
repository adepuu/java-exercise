package exercises.session5;

import com.adepuu.exercises.session5.Exercise6HashMap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Exercise6HashMapTest {
    @Test
    @DisplayName("When array is empty, it should return an empty array")
    public void testEmptyArray() {
        Exercise6HashMap solution = new Exercise6HashMap();
        int[] array = {};
        int key = 1;
        int[] expected = {};
        assertArrayEquals(expected, solution.removeDuplicates(array, key));
    }

    @Test
    @DisplayName("When array contains only the key, it should return an empty array")
    public void testSingleElementArray() {
        Exercise6HashMap solution = new Exercise6HashMap();
        int[] array = {1};
        int key = 1;
        int[] expected = {};
        assertArrayEquals(expected, solution.removeDuplicates(array, key));
    }

    @Test
    @DisplayName("When array does not contain the key, it should return the same array")
    public void testNoMatchingElement() {
        Exercise6HashMap solution = new Exercise6HashMap();
        int[] array = {2, 3, 4};
        int key = 1;
        int[] expected = {2, 3, 4};
        assertArrayEquals(expected, solution.removeDuplicates(array, key));
    }

    @Test
    @DisplayName("When array contains multiple occurrences of the key, it should remove all occurrences")
    public void testDuplicateElements() {
        Exercise6HashMap solution = new Exercise6HashMap();
        int[] array = {1, 2, 1, 3, 5, 1};
        int key = 1;
        int[] expected = {2, 3, 5};
        assertArrayEquals(expected, solution.removeDuplicates(array, key));
    }

    @Test
    @DisplayName("When array contains negative numbers, it should remove occurrences of the key")
    public void testNegativeNumbers() {
        Exercise6HashMap solution = new Exercise6HashMap();
        int[] array = {1, -2, 1, -3, 5, -1};
        int key = 1;
        int[] expected = {-2, -3, 5, -1};
        assertArrayEquals(expected, solution.removeDuplicates(array, key));
    }
}
