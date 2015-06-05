package com.realdolmen;

        import org.junit.Assert;
        import org.junit.Test;

public class FractionTest {
    @Test
    public void testIfNoemerIsCorrect(){
        Fraction f = new Fraction(25, 5);

       /* if (*/Assert.assertEquals(1, f.getNoemer())/*{
            System.out.println("Expected Noemer = " + f.getNoemer());
        }
            else {
                System.out.println("Unexpected Noemer");
            }*/
        ;}

    @Test
    public void testIfTellerIsCorrect(){
        Fraction f = new Fraction(9,3);



    }

    @Test
    public void testIfTellergedeeldDoorNoemerIsCorrect(){
        Fraction f = new Fraction(10, 3);
        Assert.assertEquals(3.33, f.tellerGedeeldDoorNoemerAsDouble(), 0.01);
    }

    @Test
    public void testIfReciprocalDoesWhatItDoesSupposedToDo(){
        Fraction f = new Fraction(5, 7);
        Fraction g = f.reciprocal();
        Assert.assertEquals(5, g.getNoemer());
        Assert.assertEquals(7, g.getTeller());
    }



}

