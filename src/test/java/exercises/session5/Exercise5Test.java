package exercises.session5;

import com.adepuu.exercises.session5.Exercise5;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Exercise5Test {

    @Test
    @DisplayName("Sort numbers in ascending order")
    void testSortNumbersAscending() {
        Exercise5 exercise5 = new Exercise5();
        int[] numbers = {8, 7, 5, 2};
        int[] expected = {2, 5, 7, 8};
        assertArrayEquals(expected, exercise5.sortNumbers(numbers, Exercise5.SORT_DIRECTION.ASC));
    }

    @Test
    @DisplayName("Sort numbers in descending order")
    void testSortNumbersDescending() {
        Exercise5 exercise5 = new Exercise5();
        int[] numbers = {8, 7, 5, 2};
        int[] expected = {8, 7, 5, 2};
        assertArrayEquals(expected, exercise5.sortNumbers(numbers, Exercise5.SORT_DIRECTION.DESC));
    }

    @Test
    @DisplayName("Sort already sorted numbers in ascending order")
    void testSortAlreadySortedAscending() {
        Exercise5 exercise5 = new Exercise5();
        int[] numbers = {2, 5, 7, 8};
        int[] expected = {2, 5, 7, 8};
        assertArrayEquals(expected, exercise5.sortNumbers(numbers, Exercise5.SORT_DIRECTION.ASC));
    }

    @Test
    @DisplayName("Sort already sorted numbers in descending order")
    void testSortAlreadySortedDescending() {
        Exercise5 exercise5 = new Exercise5();
        int[] numbers = {8, 7, 5, 2}; // Already sorted in descending order
        int[] expected = {8, 7, 5, 2};
        assertArrayEquals(expected, exercise5.sortNumbers(numbers, Exercise5.SORT_DIRECTION.DESC));
    }

    @Test
    @DisplayName("Sort numbers with duplicate values in ascending order")
    void testSortDuplicateValuesAscending() {
        Exercise5 exercise5 = new Exercise5();
        int[] numbers = {8, 7, 5, 2, 2};
        int[] expected = {2, 2, 5, 7, 8};
        assertArrayEquals(expected, exercise5.sortNumbers(numbers, Exercise5.SORT_DIRECTION.ASC));
    }

    @Test
    @DisplayName("Sort numbers with duplicate values in descending order")
    void testSortDuplicateValuesDescending() {
        Exercise5 exercise5 = new Exercise5();
        int[] numbers = {8, 7, 5, 2, 2};
        int[] expected = {8, 7, 5, 2, 2};
        assertArrayEquals(expected, exercise5.sortNumbers(numbers, Exercise5.SORT_DIRECTION.DESC));
    }

    @Test
    @DisplayName("Sort single element array in ascending order")
    void testSortSingleElementAscending() {
        Exercise5 exercise5 = new Exercise5();
        int[] numbers = {5};
        int[] expected = {5};
        assertArrayEquals(expected, exercise5.sortNumbers(numbers, Exercise5.SORT_DIRECTION.ASC));
    }

    @Test
    @DisplayName("Sort single element array in descending order")
    void testSortSingleElementDescending() {
        Exercise5 exercise5 = new Exercise5();
        int[] numbers = {5};
        int[] expected = {5};
        assertArrayEquals(expected, exercise5.sortNumbers(numbers, Exercise5.SORT_DIRECTION.DESC));
    }

    @Test
    @DisplayName("Sort empty array in ascending order")
    void testSortEmptyArrayAscending() {
        Exercise5 exercise5 = new Exercise5();
        int[] numbers = {};
        int[] expected = {};
        assertArrayEquals(expected, exercise5.sortNumbers(numbers, Exercise5.SORT_DIRECTION.ASC));
    }

    @Test
    @DisplayName("Sort empty array in descending order")
    void testSortEmptyArrayDescending() {
        Exercise5 exercise5 = new Exercise5();
        int[] numbers = {};
        int[] expected = {};
        assertArrayEquals(expected, exercise5.sortNumbers(numbers, Exercise5.SORT_DIRECTION.DESC));
    }
}
