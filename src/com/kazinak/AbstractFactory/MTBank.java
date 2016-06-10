package com.kazinak.AbstractFactory;

/**
 * Created by AnriShitsko on 10.06.2016.
 */
public class MTBank implements Bank {
    private final String bankName;
    public MTBank() {
        bankName = "MTBank";
    }
    @Override
    public String getBankName() {
        return bankName;
    }
}
