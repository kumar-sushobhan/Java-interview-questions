package com.sushobhan.sapient.parkingLot;

import java.util.List;

public abstract class ParkingSpotManager {
    private final List<ParkingSpot> parkingSpotList;

    public ParkingSpotManager(List<ParkingSpot> parkingSpotList) {
        this.parkingSpotList = parkingSpotList;
    }

    abstract ParkingSpot findParkingSpot();

    public void parkVehicleInAvailableSpot(Vehicle v) {
        ParkingSpot parkingSpot = findParkingSpot();
        parkingSpot.parkVehicle(v);
    }

    public void removeVehicleFromSpot(Vehicle v) {
        for (ParkingSpot parkingSpot : parkingSpotList) {
            if (parkingSpot.getVehicle() != null && parkingSpot.getVehicle().equals(v)) {
                parkingSpot.removeVehicle(v);
                break;
            }
        }
    }
}
