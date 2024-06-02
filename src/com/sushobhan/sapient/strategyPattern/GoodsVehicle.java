package com.sushobhan.sapient.strategyPattern;

import com.sushobhan.sapient.strategyPattern.strategyClientAsk.DriveStrategy;

public class GoodsVehicle extends Vehicle {
    public GoodsVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }

    @Override
    public void drive(DriveStrategy driveStrategy) {
        System.out.println("this is normal vehicle with normal drive strategy");
    }
}
