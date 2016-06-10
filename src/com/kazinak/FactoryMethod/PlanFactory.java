package com.kazinak.FactoryMethod;

/**
 * Created by AnriShitsko on 10.06.2016.
 */
public class PlanFactory {
    public Plan getPlan(String planType) {
        if (planType == null)
            return null;
        if (planType.equalsIgnoreCase("Domestic"))
            return new DomesticPlan();
        else if (planType.equalsIgnoreCase("Commercial"))
            return new CommercialPlan();
        else if (planType.equalsIgnoreCase("Institution"))
            return new InstitutionalPlan();
        return null;
    }
}
