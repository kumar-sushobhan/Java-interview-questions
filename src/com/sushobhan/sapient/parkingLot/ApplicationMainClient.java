package com.sushobhan.sapient.parkingLot;

import java.util.ArrayList;
import java.util.List;

public class ApplicationMainClient {
    public static void main(String[] args) {
        // Initialize parking spots
        List<ParkingSpot> parkingSpots = new ArrayList<>();
        for (int i = 1; i <= 100; ++i) {
            if (i <= 50)
                parkingSpots.add(new ParkingSpot(i, 10));
            else
                parkingSpots.add(new ParkingSpot(i, 20));
        }

        // Create Parking Spot manager factory
        ParkingSpotManagerFactory parkingSpotManagerFactory = new ParkingSpotManagerFactory();

        // using above factory, create entry and exit gates

    }
}
