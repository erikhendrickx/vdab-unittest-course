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
    }

    public Fraction multiply(Fraction that){
        int multiplyNoemer = this.getNoemer() * that.getNoemer();
        int multiplyTeller = this.getTeller() * that.getTeller();
        Fraction result = new Fraction(multiplyTeller, multiplyNoemer);
        return result;
    }

    void simplify(){
        int gcf = Utilities.greatestCommonFactor(teller, noemer);
        noemer /= gcf;
        teller /= gcf;
    }

    public double tellerGedeeldDoorNoemerAsDouble(){
        return ((double) teller) / noemer;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Fraction)) return false;
        Fraction that = (Fraction)obj;
        return this.noemer == that.noemer && this.teller == that.teller;
    }

    @Override
    public String toString() {
        return noemer + "/" + teller;
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
