package com.sushobhan.sapient.strategyPattern;

import com.sushobhan.sapient.strategyPattern.strategyClientAsk.DriveStrategy;

public class SpecialVehicle extends Vehicle {
    public SpecialVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }

    @Override
    public void drive(DriveStrategy driveStrategy) {
        System.out.println("this is special vehicle with XYZ drive strategy");
    }
}
