package com.kazinak.FactoryMethod;

/**
 * Created by AnriShitsko on 10.06.2016.
 */
public class CommercialPlan extends Plan {
    @Override
    public void applyRate() {
        rate = 7.50;
    }
}
