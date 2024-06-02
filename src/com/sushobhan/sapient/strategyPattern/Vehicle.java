package com.sushobhan.sapient.strategyPattern;

import com.sushobhan.sapient.strategyPattern.strategyClientAsk.DriveStrategy;

public class Vehicle {
    private final DriveStrategy driveStrategy;

    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive(DriveStrategy driveStrategy) {
        driveStrategy.driveStrategy();
        System.out.println("Vehicle is being driven");
    }
}
