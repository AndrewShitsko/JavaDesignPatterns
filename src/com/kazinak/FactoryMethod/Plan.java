package com.kazinak.FactoryMethod;

/**
 * Created by AnriShitsko on 10.06.2016.
 */
public abstract class Plan {
    protected double rate;
    public abstract void applyRate();

    public void calculateBill(int units) {
        System.out.println(units * rate);
    }
}
