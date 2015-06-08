package com.realdolmen;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {

    @Test
    public void testMyStringCalculator1() throws Exception{
       StringCalculator stringCalculator =  new StringCalculator();
        int y = stringCalculator.add("");
        assertEquals(0, y);
    }

}
