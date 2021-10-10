package org.blz.genrics;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;


public class GenericsTest
{

    @Test
    public void given3Values_WhenGetMaximum_ShouldReturnCorrectValue()

    {
      int actualResult= Maximum.getMaximum(30,10,20);
        Assert.assertEquals(30,actualResult);
    }
}
