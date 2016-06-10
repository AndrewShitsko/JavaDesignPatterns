import com.kazinak.AbstractFactory.AbstractFactory;
import com.kazinak.AbstractFactory.Bank;
import com.kazinak.AbstractFactory.FactoryCreator;
import com.kazinak.AbstractFactory.Loan;
import com.kazinak.FactoryMethod.Plan;
import com.kazinak.FactoryMethod.PlanFactory;
import com.kazinak.Singleton.Singleton;

public class Main {

    public static void main(String[] args) {
        // Singleton
        System.out.println("1. Singleton Pattern Example:");
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println();

        // Factory Method
        System.out.println("2. Factory Method Pattern Example:");
        PlanFactory planFactory = new PlanFactory();
        int units = 500;
        String planName = "Domestic";
        System.out.println("You've chosen the " + planName + " plan with units = " + units);
        Plan plan = planFactory.getPlan(planName);
        plan.applyRate();
        plan.calculateBill(units);

        System.out.println();

        // Abstract Factory
        System.out.println("3. Abstract Factory Pattern Example:");
        String bankName = "MTBank";
        String loanName = "Business";
        AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");
        Bank bank = bankFactory.getBank(bankName);
        double rate = 12.95;
        double loanAmount = 5000000;
        int years = 10;
        System.out.println("You've chosen " + bank.getBankName() + " with rate = " + rate + ", loan amount = " + loanAmount + " for " + years + " years");
        AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");
        Loan loan = loanFactory.getLoan(loanName);
        loan.setRate(rate);
        loan.calculateLoanPayment(loanAmount, years);

        System.out.println();


    }
}
