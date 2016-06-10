package com.kazinak.AbstractFactory;

/**
 * Created by AnriShitsko on 10.06.2016.
 */
public abstract class Loan {
    protected double rate;
    public abstract void setRate(double rate);
    public void calculateLoanPayment(double loanAmount, int years) {
        /*
            to calculate the monthly loan payment, i.e. EMI

            rate = annual interest rate / 12 * 100;
            n = number of monthly installments;
            1 year = 12 months.
            so, n = years * 12;
        */

        rate /= 1200;
        int n = years * 12;
        double emi = (rate * Math.pow((1 + rate), n)) / ((Math.pow((1 + rate) ,n)) - 1) * loanAmount;
        System.out.println("Your monthly EMI is " + emi + " for the amount " + loanAmount + " you have borrowed");
    }
}
