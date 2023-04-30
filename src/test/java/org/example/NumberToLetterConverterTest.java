package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumberToLetterConverterTest {
    @Test
    void replaceNumbersWithLetters() {
        String inputText = "Hello, I have 3 apples and 1 banana. Let's meet at building 7.";
        String expectedOutput = "Hello, I have C apples and A banana. Let's meet at building G.";
        assertEquals(expectedOutput, NumberToLetterConverter.replaceNumbersWithLetters(inputText));
    }

    @Test
    public void testReplaceNumbersWithLettersWithNoNumbers() {
        String inputText = "This string contains no numbers.";
        String expectedOutput = "This string contains no numbers.";

        String actualOutput = NumberToLetterConverter.replaceNumbersWithLetters(inputText);
        assertEquals(expectedOutput, actualOutput);
    }
}
