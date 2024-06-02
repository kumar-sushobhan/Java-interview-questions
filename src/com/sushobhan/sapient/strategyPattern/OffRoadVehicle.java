package com.sushobhan.sapient.strategyPattern;

import com.sushobhan.sapient.strategyPattern.strategyClientAsk.SportDriveStrategy;

public class OffRoadVehicle extends Vehicle{
    OffRoadVehicle(){
        super(new SportDriveStrategy());
    }
}
