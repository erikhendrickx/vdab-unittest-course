package com.realdolmen;


public class Fraction {
    private int noemer;
    private int teller;

    public Fraction(){

    }

    public Fraction(int teller, int noemer) {
        if (noemer == 0) throw new ArithmeticException(("Noemer mag niet '0' zijn"));

        this.teller = teller;
        this.noemer = noemer;
        simplify();
    }

    public Fraction reciprocal(){
        return new Fraction(this.noemer, this.teller);

    void simplify(){
        int gcf = Utilities.greatestCommonFactor(teller, noemer);
        noemer /= gcf;
        teller /= gcf;
    }

    public double tellerGedeeldDoorNoemerAsDouble(){
        return ((double) teller) / noemer;
    }



    public int getNoemer() {
        return noemer;
    }

    public void setNoemer(int noemer) {
        this.noemer = noemer;
    }

    public int getTeller() {
        return teller;
    }

    public void setTeller(int teller) {
        this.teller = teller;
    }
}
