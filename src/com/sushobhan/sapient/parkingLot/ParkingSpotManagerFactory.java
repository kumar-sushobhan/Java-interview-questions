package com.sushobhan.sapient.parkingLot;

import java.util.List;

public class ParkingSpotManagerFactory {
    ParkingSpotManager getParkingSpotManager(VehicleTypes vehicleTypes, List<ParkingSpot> parkingSpots){
        switch (vehicleTypes){
            case TwoWheeler -> {
                return new TwoWheelerManager(parkingSpots);
            }
            case FourWheeler -> {
                return new FourWheelerManager(parkingSpots);
            }
            default -> throw new RuntimeException("Vehicle type is compatible in this Parking Lot... " + vehicleTypes);
        }
    }
}
