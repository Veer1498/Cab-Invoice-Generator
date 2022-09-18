package com.cabinvoicegenerator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Cab Invoice Generator");

        InvoiceGenerator generator = new InvoiceGenerator();

        generator.fareCalculation(10,15);

    }
}
