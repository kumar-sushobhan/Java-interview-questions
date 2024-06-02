package com.sushobhan.sapient.strategyPattern.strategyClientAsk;

public class NormalDriveStrategy implements DriveStrategy {

    @Override
    public void driveStrategy() {
        System.out.println("This is normal drive strategy");
    }
}
