package com.sushobhan.sapient.parkingLot;

import java.util.List;

public class FourWheelerManager extends ParkingSpotManager{
    public FourWheelerManager(List<ParkingSpot> parkingSpotList) {
        super(parkingSpotList);
    }

    @Override
    ParkingSpot findParkingSpot() {
        return null;
    }
}
