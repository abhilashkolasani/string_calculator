package org.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {
    StringCalculator stringCalculator = new StringCalculator();

    @Test
    void testAddWithNull() {
        assertEquals(0, stringCalculator.add(null));
    }

    @Test
    void testAddWithEmptyString() {
        assertEquals(0, stringCalculator.add(""));
    }

    @Test
    void testAddWithSpaceString() {
        assertEquals(0, stringCalculator.add(" "));
    }

    @Test
    void testAddWithOneNumber() {
        assertEquals(1, stringCalculator.add("1"));
    }

    @Test
    void testAddWithTwoNumbers() {
        assertEquals(3, stringCalculator.add("1,2"));
    }

    @Test
    void testAddWithNewLineDelimiter() {
        assertEquals(6, stringCalculator.add("1,2\n3"));
    }
}