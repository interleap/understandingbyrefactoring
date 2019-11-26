package com.example.cleancode;

import org.junit.Test;

import static com.example.cleancode.Main.*;
import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void shouldCalculateAnswerForMultipleTestCases() {
        assertEquals(18, calculateAnswerForTestCase(11,19));
        assertEquals(1, calculateAnswerForTestCase(10,15));
        assertEquals(2, calculateAnswerForTestCase(10,11));
        assertEquals(35, calculateAnswerForTestCase(8,213));
        assertEquals(6, calculateAnswerForTestCase(5,7));
        assertEquals(2, calculateAnswerForTestCase(19,33));
        assertEquals(-1, calculateAnswerForTestCase(5,2));
        assertEquals(1, calculateAnswerForTestCase(20,6));
        assertEquals(-1, calculateAnswerForTestCase(20,5));
    }

    @Test
    public void shouldCalculateGCDWithoutCaringAboutWhatNumberIsLarger(){
        assertEquals(4, orderInsensitiveGCD(8,220));
        assertEquals(4, orderInsensitiveGCD(220,8));
        assertEquals(1, orderInsensitiveGCD(13,2));
    }
}