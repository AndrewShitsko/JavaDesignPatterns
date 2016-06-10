package com.kazinak.AbstractFactory;

/**
 * Created by AnriShitsko on 10.06.2016.
 */
public class LoanFactory extends AbstractFactory {
    @Override
    public Bank getBank(String bankName) {
        return null;
    }

    @Override
    public Loan getLoan(String loanType) {
        if (loanType == null)
            return null;
        if (loanType.equalsIgnoreCase("Home"))
            return new HomeLoan();
        else if (loanType.equalsIgnoreCase("Business"))
            return new BusinessLoan();
        else if (loanType.equalsIgnoreCase("Education"))
            return new EducationLoan();
        return null;
    }
}
