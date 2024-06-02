package com.sushobhan.sapient.strategyPattern;

import com.sushobhan.sapient.strategyPattern.strategyClientAsk.DriveStrategy;
import com.sushobhan.sapient.strategyPattern.strategyClientAsk.XYZDriveStrategy;

public class MainClassClient {
    public static void main(String[] args) {
        DriveStrategy driveStrategy = new XYZDriveStrategy();
        Vehicle vehicle = new SpecialVehicle(driveStrategy);
        vehicle.drive(driveStrategy);
    }
}
