package com.pantavanij.code;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */

    int[] givenNumbers = new int[]{1, 5, 2, 2, 5, 4, 7, 9};
    int[] answers1 = new int[]{
            1, 2, 2, 4, 5, 5, 7, 9
    };
    int answer2 = 35;
    double answer3 = 4.5d;

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void shouldBeSorted() {

        assertArrayEquals("Question1: Check", App.sorted(givenNumbers), answers1);

    }

    @Test
    public void shouldBeSummation() {
        assertEquals("Question2: Check", App.summation(givenNumbers), answer2);
    }

    @Test
    public void shouldBeCorrectMedian() {

        double epsilon = 0.000001d;

        Assert.assertTrue("Question3: Check", Math.abs(App.median(givenNumbers) - answer3) < epsilon);
    }
}
