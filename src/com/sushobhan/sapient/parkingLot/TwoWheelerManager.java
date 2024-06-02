package com.sushobhan.sapient.parkingLot;

import java.util.List;

public class TwoWheelerManager extends ParkingSpotManager{
    public TwoWheelerManager(List<ParkingSpot> parkingSpotList) {
        super(parkingSpotList);
    }

    @Override
    ParkingSpot findParkingSpot() {
        return null;
    }
}
