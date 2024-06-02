package com.sushobhan.sapient.parkingLot;

import java.util.ArrayList;

public class ExitGate {
    ParkingSpotManagerFactory parkingSpotManagerFactory;

    public ExitGate(ParkingSpotManagerFactory parkingSpotManagerFactory) {
        this.parkingSpotManagerFactory = parkingSpotManagerFactory;
    }

    void removeVehicleFromSpot(Ticket ticket){
        ParkingSpotManager parkingSpotManager = parkingSpotManagerFactory.getParkingSpotManager(ticket.getVehicle().getVehicleTypes(), new ArrayList<>());
        parkingSpotManager.removeVehicleFromSpot(ticket.getVehicle());
    }
}
