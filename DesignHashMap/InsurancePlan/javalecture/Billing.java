package com.javalecture;

public class Billing {

    public static double[] computePayment(Patient patient, double amount) {

        double[] payments = new double[2];

        InsurancePlan patientInsurancePlan = patient.getInsurancePlan();

        double insuranceCompanyPayment = patientInsurancePlan == null ? 0 : patientInsurancePlan.getCoverage() * amount;

        double patientFinalPayment = amount - insuranceCompanyPayment;

        payments[0] = insuranceCompanyPayment;
        payments[1] = patientFinalPayment;

        return payments;
    }
}
