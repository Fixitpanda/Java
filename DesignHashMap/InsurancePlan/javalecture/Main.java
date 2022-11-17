package com.javalecture;

public class Main {

    public static void main(String[] args) {

        InsurancePlan insurancePlan = new PlatinumPlan();
        InsurancePlan goldPlan = new GoldPlan();
        InsurancePlan silverPlan = new SilverPlan();

        Patient patient = new Patient();

        patient.setInsurancePlan(insurancePlan);
        patient.setInsurancePlan(goldPlan);
        patient.setInsurancePlan(silverPlan);

        double[] payments = Billing.computePayment(patient, 1000);

        System.out.println("Insurance company will pay : " + payments[0]);
        System.out.println("Patient will pay : " + payments[1]);

    }

}
