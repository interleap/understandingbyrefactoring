package com.example.cleancode;

import org.junit.Test;

import static com.example.cleancode.Main.*;
import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void shouldCalculateAnswerForMultipleTestCases() {
        assertEquals(18, calculateAnswerForTestCase(new Fraction(11, 19)));
        assertEquals(1,  calculateAnswerForTestCase(new Fraction(10, 15)));
        assertEquals(2,  calculateAnswerForTestCase(new Fraction(10, 11)));
        assertEquals(35, calculateAnswerForTestCase(new Fraction(8, 213)));
        assertEquals(6,  calculateAnswerForTestCase(new Fraction(5, 7)));
        assertEquals(2,  calculateAnswerForTestCase(new Fraction(19, 33)));
        assertEquals(-1, calculateAnswerForTestCase(new Fraction(5, 2)));
        assertEquals(1,  calculateAnswerForTestCase(new Fraction(20, 6)));
        assertEquals(-1, calculateAnswerForTestCase(new Fraction(20, 5)));
    }

}