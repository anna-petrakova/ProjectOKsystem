package Part_1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Class for testing solution class from package Part_1. Methods ending in
 * "Solution1" test first method, methods ending with "Solution2" are
 * identical, but test the second method in the class.
 */
public class SolutionTest {
    private Solution sol = new Solution();

    @Test
    public void isASuffixSolution1() {
        assertTrue(sol.solution("abcd", "cd"));
    }
    @Test
    public void isNotASuffixSingleCharacterSolution1() {
        assertFalse(sol.solution("abcd", "e"));
    }
    @Test
    public void isNotSuffixMultipleCharactersSolution1() {
        assertFalse(sol.solution("abcd", "ecg"));
    }
    @Test
    public void isNotSuffixButSubstringSolution1() {
        assertFalse(sol.solution("pourtyg", "urty"));
    }
    @Test
    public void repeatedSubstringAndSuffixSolution1() {
        assertTrue(sol.solution("alenoaledoale", "ale"));
    }
    @Test
    public void suffixIsEmptySolution1() {
        assertTrue(sol.solution("abcd", ""));
    }
    @Test
    public void stringIsEmptySolution1() {
        assertFalse(sol.solution("", "bc"));
    }
    @Test
    public void stringAndSuffixAreEmptySolution1() {
        assertTrue(sol.solution("", ""));
    }
    @Test
    public void stringsAreEqualSolution1() {
        assertTrue(sol.solution("abcd", "abcd"));
    }
    @Test
    public void suffixDiffersInLastCharacterSolution1() {
        assertFalse(sol.solution("abcd", "bce"));
    }
    @Test
    public void suffixIsLongerThanStringSolution1() {
        assertFalse(sol.solution("abcd", "abcde"));
    }
    @Test
    public void suffixIsNullSolution1() {
        assertFalse(sol.solution("abcd", null));
    }
    @Test
    public void stringIsNullSolution1() {
        assertFalse(sol.solution(null, "bc"));
    }

    // Tests for solution2
    @Test
    public void isASuffixSolution2() {
        assertTrue(sol.solution2("abcd", "cd"));
    }
    @Test
    public void isNotASuffixSingleCharacterSolution2() {
        assertFalse(sol.solution2("abcd", "e"));
    }
    @Test
    public void isNotSuffixMultipleCharactersSolution2() {
        assertFalse(sol.solution2("abcd", "ecg"));
    }
    @Test
    public void isNotSuffixButSubstringSolution2() {
        assertFalse(sol.solution2("pourtyg", "urty"));
    }
    @Test
    public void repeatedSubstringAndSuffixSolution2() {
        assertTrue(sol.solution2("alenoaledoale", "ale"));
    }
    @Test
    public void suffixIsEmptySolution2() {
        assertTrue(sol.solution2("abcd", ""));
    }
    @Test
    public void stringIsEmptySolution2() {
        assertFalse(sol.solution2("", "bc"));
    }
    @Test
    public void stringAndSuffixAreEmptySolution2() {
        assertTrue(sol.solution2("", ""));
    }
    @Test
    public void stringsAreEqualSolution2() {
        assertTrue(sol.solution2("abcd", "abcd"));
    }
    @Test
    public void suffixDiffersInLastCharacterSolution2() {
        assertFalse(sol.solution2("abcd", "bce"));
    }
    @Test
    public void suffixIsLongerThanStringSolution2() {
        assertFalse(sol.solution2("abcd", "abcde"));
    }
    @Test
    public void suffixIsNullSolution2() {
        assertFalse(sol.solution2("abcd", null));
    }
    @Test
    public void stringIsNullSolution2() {
        assertFalse(sol.solution2(null, "bc"));
    }

}
