package org.blz.genrics;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;


public class GenericsTest {

    @Test
    public void given3Values_WhenGetMaximum_ShouldReturnCorrectValue() {
        int actualResult = Maximum.getMaximum(30, 10, 20);
        Assert.assertEquals(30, actualResult);
    }

    @Test
    public void given3FloatValues_WhenGetMaximum_ShouldReturnCorrectValue() {
        float actualResult = Maximum.getMaximum(40f, 10f, 20f);
        Assert.assertEquals(40, actualResult, 0.0);

    }

    @Test
    public void given3StringValues_WhenGetMaximum_ShouldReturnCorrectValue2() {
        String actualResult = Maximum.getMaximum("apple", "peach", "banana");
        Assert.assertEquals("peach", actualResult);
    }
}

