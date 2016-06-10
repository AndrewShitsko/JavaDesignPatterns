package com.kazinak.AbstractFactory;

/**
 * Created by AnriShitsko on 10.06.2016.
 */
public class BelarusBank implements Bank {
    private final String bankName;
    public BelarusBank() {
        bankName = "BelarusBank";
    }
    @Override
    public String getBankName() {
        return bankName;
    }
}
