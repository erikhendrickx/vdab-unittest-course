package com.realdolmen;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class StringCalculatorTest {

    @Test
    public void testMyStringCalculator1() throws Exception{
        StringCalculator stringCalculator1 =  new StringCalculator();
        int y = stringCalculator1.add("");
        assertEquals(0, y);
    }

    @Test
    public void testMyStringCalculator2() throws Exception{
        StringCalculator stringCalculator2 = new StringCalculator();
        int y = stringCalculator2.add("1");
        assertEquals(1, y);
    }

    @Test
    public void testMyStringCalculator3() throws Exception{
        StringCalculator stringCalculator3 = new StringCalculator();
        double y = stringCalculator3.add("1");
        assertEquals(1.2, y);
    }


}
