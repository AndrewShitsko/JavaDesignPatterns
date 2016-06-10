package com.kazinak.AbstractFactory;

/**
 * Created by AnriShitsko on 10.06.2016.
 */
public class BelinvestBank implements Bank {
    private final String bankName;
    public BelinvestBank() {
        bankName = "BelinvestBank";
    }
    @Override
    public String getBankName() {
        return bankName;
    }
}
