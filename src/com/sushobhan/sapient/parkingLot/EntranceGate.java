package com.sushobhan.sapient.parkingLot;

import java.util.List;

public class EntranceGate {
    ParkingSpotManagerFactory parkingSpotManagerFactory;

    public EntranceGate(ParkingSpotManagerFactory parkingSpotManagerFactory) {
        this.parkingSpotManagerFactory = parkingSpotManagerFactory;
    }

    ParkingSpot findParkingSpot(VehicleTypes vehicleTypes, List<ParkingSpot>parkingSpots){
        ParkingSpotManager parkingSpotManager = parkingSpotManagerFactory.getParkingSpotManager(vehicleTypes, parkingSpots);
        return parkingSpotManager.findParkingSpot();
    }

    Ticket generateTicket(){
        // implement method to generate ticket
        return null;
    }
}
