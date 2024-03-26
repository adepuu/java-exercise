package exercises.session5;

import com.adepuu.exercises.session5.Exercise8;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise8Test {
    @Test
    @DisplayName("Test if duplicates in [4,3,2,7,8,2,3,1] are [2,3]")
    void testFindDuplicatesExample1() {
        int[] source = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> expected = Arrays.asList(2, 3);
        Exercise8 solution = new Exercise8();
        assertEquals(expected, solution.findDuplicates(source));
    }

    @Test
    @DisplayName("Test if duplicates in [1,1,2] are [1]")
    void testFindDuplicatesExample2() {
        int[] source = {1, 1, 2};
        List<Integer> expected = List.of(1);
        Exercise8 solution = new Exercise8();
        assertEquals(expected, solution.findDuplicates(source));
    }

    @Test
    @DisplayName("Test if duplicates in [1] are []")
    void testFindDuplicatesExample3() {
        int[] source = {1};
        List<Integer> expected = List.of();
        Exercise8 solution = new Exercise8();
        assertEquals(expected, solution.findDuplicates(source));
    }
}
