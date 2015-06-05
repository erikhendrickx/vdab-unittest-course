package com.realdolmen;


public class Fraction {
    private int noemer;
    private int teller;

    public Fraction(){

    }

    public Fraction(int teller, int noemer) {
        this.noemer = noemer;
        this.teller = teller;
    }

    public double asDouble(){
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
