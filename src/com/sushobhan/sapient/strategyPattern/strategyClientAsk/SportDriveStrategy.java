package com.sushobhan.sapient.strategyPattern.strategyClientAsk;

public class SportDriveStrategy implements DriveStrategy {
    @Override
    public void driveStrategy() {
        System.out.println("This is sport drive strategy");
    }
}
