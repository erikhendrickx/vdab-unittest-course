package com.realdolmen;

        import org.junit.Assert;
        import org.junit.Test;

public class FractionTest {
    @Test
    public void testIfNoemerIsCorrect(){
        Fraction f = new Fraction(5, 25);
        Assert.assertEquals(25, f.getNoemer());
    }

    @Test
    public void testIfTellerIsCorrect(){
        

    }

    @Test
    public void testAsDoubleIsCorrect(){
        Fraction f = new Fraction(10, 3);
        Assert.assertEquals(3.33, f.asDouble(), 0.01);
    }

}

