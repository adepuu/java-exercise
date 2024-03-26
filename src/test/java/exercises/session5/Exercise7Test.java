package exercises.session5;

import com.adepuu.exercises.session5.Exercise7;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Exercise7Test {
    @Test
    @DisplayName("Test if 'anagram' and 'nagaram' are anagrams")
    void testAnagram() {
        String source = "anagram";
        String target = "nagaram";
        Exercise7 solution = new Exercise7();
        assertTrue(solution.isAnagram(source, target));
    }

    @Test
    @DisplayName("Test if 'rat' and 'car' are not anagrams")
    void testNotAnagram() {
        String source = "rat";
        String target = "car";
        Exercise7 solution = new Exercise7();
        assertFalse(solution.isAnagram(source, target));
    }

    @Test
    @DisplayName("Test if 'racecar' and 'racecar' are anagrams")
    void testSameWordAnagram() {
        String source = "racecar";
        String target = "racecar";
        Exercise7 solution = new Exercise7();
        assertTrue(solution.isAnagram(source, target));
    }

    @Test
    @DisplayName("Test if 'a' and 'a' are anagrams")
    void testSingleCharacterAnagram() {
        String source = "a";
        String target = "a";
        Exercise7 solution = new Exercise7();
        assertTrue(solution.isAnagram(source, target));
    }

    @Test
    @DisplayName("Test if 'abc' and 'cba' are anagrams")
    void testSimpleAnagram() {
        String source = "abc";
        String target = "cba";
        Exercise7 solution = new Exercise7();
        assertTrue(solution.isAnagram(source, target));
    }

    @Test
    @DisplayName("Test if 'abc' and 'abcd' are not anagrams due to different lengths")
    void testDifferentLengths() {
        String source = "abc";
        String target = "abcd";
        Exercise7 solution = new Exercise7();
        assertFalse(solution.isAnagram(source, target));
    }

    @Test
    @DisplayName("Test if 'abc' and 'cbae' are not anagrams due to different characters")
    void testDifferentCharacters() {
        String source = "abc";
        String target = "cbae";
        Exercise7 solution = new Exercise7();
        assertFalse(solution.isAnagram(source, target));
    }
}
