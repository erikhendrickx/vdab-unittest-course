package com.realdolmen;

        import org.junit.Assert;
        import org.junit.Test;

public class FractionTest {
    @Test
    public void testIfNoemerIsCorrect(){
        Fraction f = new Fraction(25,5);
        Assert.assertEquals(25, f.getNoemer());
    }
}
