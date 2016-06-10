package com.kazinak.AbstractFactory;

/**
 * Created by AnriShitsko on 10.06.2016.
 */
public class BankFactory extends AbstractFactory {
    @Override
    public Bank getBank(String bankName) {
        if (bankName == null)
            return null;
        if (bankName.equalsIgnoreCase("BelinvestBank"))
            return new BelarusBank();
        else if (bankName.equalsIgnoreCase("MTBank"))
            return new MTBank();
        else if (bankName.equalsIgnoreCase("BelarusBank"))
            return new BelarusBank();
        return null;
    }

    @Override
    public Loan getLoan(String loanType) {
        return null;
    }
}
