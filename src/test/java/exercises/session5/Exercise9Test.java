package exercises.session5;

import com.adepuu.exercises.session5.Exercise9;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Exercise9Test {
    @Test
    @DisplayName("Test with normal temperatures")
    void testNormalTemperatures() {
        Exercise9 solution = new Exercise9();
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] expected = {1, 1, 4, 2, 1, 1, 0, 0};
        assertArrayEquals(expected, solution.dailyTemperatures(temperatures));
    }

    @Test
    @DisplayName("Test with all same temperatures")
    void testAllSameTemperatures() {
        Exercise9 solution = new Exercise9();
        int[] temperatures = {73, 73, 73, 73, 73, 73, 73, 73};
        int[] expected = {0, 0, 0, 0, 0, 0, 0, 0};
        assertArrayEquals(expected, solution.dailyTemperatures(temperatures));
    }

    @Test
    @DisplayName("Test with increasing temperatures")
    void testIncreasingTemperatures() {
        Exercise9 solution = new Exercise9();
        int[] temperatures = {73, 74, 75, 76, 77, 78, 79, 80};
        int[] expected = {1, 1, 1, 1, 1, 1, 1, 0};
        assertArrayEquals(expected, solution.dailyTemperatures(temperatures));
    }

    @Test
    @DisplayName("Test with decreasing temperatures")
    void testDecreasingTemperatures() {
        Exercise9 solution = new Exercise9();
        int[] temperatures = {80, 79, 78, 77, 76, 75, 74, 73};
        int[] expected = {0, 0, 0, 0, 0, 0, 0, 0};
        assertArrayEquals(expected, solution.dailyTemperatures(temperatures));
    }

    @Test
    @DisplayName("Test with single temperature")
    void testSingleTemperature() {
        Exercise9 solution = new Exercise9();
        int[] temperatures = {73};
        int[] expected = {0};
        assertArrayEquals(expected, solution.dailyTemperatures(temperatures));
    }

    @Test
    @DisplayName("Test with empty temperatures array")
    void testEmptyTemperatures() {
        Exercise9 solution = new Exercise9();
        int[] temperatures = {};
        int[] expected = {};
        assertArrayEquals(expected, solution.dailyTemperatures(temperatures));
    }
}
