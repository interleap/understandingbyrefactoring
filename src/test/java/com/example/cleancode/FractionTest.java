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
}