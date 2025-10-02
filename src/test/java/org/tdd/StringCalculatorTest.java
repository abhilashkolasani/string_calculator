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
}