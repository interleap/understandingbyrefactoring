package com.example.cleancode;

import org.junit.Test;

import static org.junit.Assert.*;

public class FractionTest {
    @Test
    public void shouldReduceReducableFraction(){
        assertEquals(new Fraction(7,9), new Fraction(35,45).reduce());
    }

    @Test
    public void shouldReduceReducableFractionWithLargerDenominator(){
        assertEquals(new Fraction(5,4),
                new Fraction(50,40).reduce());
    }

    @Test
    public void shouldKeepUnreducableFractionTheSame(){
        assertEquals(new Fraction(19,5),
                new Fraction(19,5).reduce());
    }

    @Test
    public void shouldReturnTrueForTerminatingFraction(){
        assertTrue(new Fraction(203, 200).isTerminating());
    }

    @Test
    public void shouldReturnFalseForNonTerminatingFraction(){
        assertFalse(new Fraction(203, 201).isTerminating());
    }

    @Test
    public void shouldCalculateAnswerForMultipleTestCases() {
        assertEquals(18, new Fraction(11, 19).numberOfDigitsInRepeatingDecimal());
        assertEquals(1,  new Fraction(10, 15).numberOfDigitsInRepeatingDecimal());
        assertEquals(2,  new Fraction(10, 11).numberOfDigitsInRepeatingDecimal());
        assertEquals(35, new Fraction(8, 213).numberOfDigitsInRepeatingDecimal());
        assertEquals(6,  new Fraction(5, 7).numberOfDigitsInRepeatingDecimal());
        assertEquals(2,  new Fraction(19, 33).numberOfDigitsInRepeatingDecimal());
        assertEquals(-1, new Fraction(5, 2).numberOfDigitsInRepeatingDecimal());
        assertEquals(1,  new Fraction(20, 6).numberOfDigitsInRepeatingDecimal());
        assertEquals(-1, new Fraction(20, 5).numberOfDigitsInRepeatingDecimal());
        assertEquals(-1, new Fraction(5, 20).numberOfDigitsInRepeatingDecimal());
        assertEquals(18, new Fraction(30, 19).numberOfDigitsInRepeatingDecimal());
    }


}