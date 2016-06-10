package com.kazinak.AbstractFactory;

/**
 * Created by AnriShitsko on 10.06.2016.
 */
public class FactoryCreator {
    public static AbstractFactory getFactory(String factoryType) {
        if (factoryType == null)
            return null;
        if (factoryType.equalsIgnoreCase("Bank"))
            return new BankFactory();
        else if (factoryType.equalsIgnoreCase("Loan"))
            return new LoanFactory();
        return null;
    }
}
