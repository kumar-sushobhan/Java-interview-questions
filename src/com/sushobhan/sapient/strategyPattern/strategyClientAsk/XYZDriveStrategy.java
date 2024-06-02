package com.sushobhan.sapient.strategyPattern.strategyClientAsk;

public class XYZDriveStrategy implements DriveStrategy{
    @Override
    public void driveStrategy() {
        System.out.println("this is XYZ drive strategy for special vehicle types");
    }
}
