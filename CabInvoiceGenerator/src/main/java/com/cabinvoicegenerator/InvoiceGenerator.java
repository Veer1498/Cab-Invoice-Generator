package com.cabinvoicegenerator;

public class InvoiceGenerator {
    public static final int COST_PER_KM = 10;
    public static final int COST_PER_MIN = 1;
    public static final int MIN_FARE = 5;


    public double fareCalculation(double distance, double time){
        double fare;
        if (distance<(0.5)){
            fare = 5;
            return fare;
        }
            fare =  (distance*COST_PER_KM)+(time*COST_PER_MIN);
        return fare;
    }
}
