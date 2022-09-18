package com.cabinvoicegenerator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InvoiceGeneratorTest {

    @Test
    public void passingDistAndTimeShldReturn_CrctFare(){
        double distance = 3;
        double time = 10;
        InvoiceGenerator generator = new InvoiceGenerator();
        double result = generator.fareCalculation(distance,time);
        Assertions.assertEquals(40.0,result);
    }

    @Test
    public void passingMinDistAndTimeShldReturn_CrctFare(){
        double distance = 0.2;
        double time = 1;
        InvoiceGenerator generator = new InvoiceGenerator();
        double result = generator.fareCalculation(distance,time);
        Assertions.assertEquals(5.0,result);
    }

    @Test
    public void passingMultipleRidesShldReturn_CrctFare(){
       RideDetails[] ride = {
               new RideDetails(2.0,4),
               new RideDetails(0.1,1)
                };
        InvoiceGenerator generator = new InvoiceGenerator();
        double result = generator.calculateFare(ride);
        Assertions.assertEquals(29.0,result);
    }

}
