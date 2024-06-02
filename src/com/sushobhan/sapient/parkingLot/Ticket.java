package com.sushobhan.sapient.parkingLot;

public class Ticket {
    private long entryTime;
    public ParkingSpot parkingSpot;
    private Vehicle vehicle;

    public Ticket(long entryTime, ParkingSpot parkingSpot, Vehicle vehicle) {
        this.entryTime = entryTime;
        this.parkingSpot = parkingSpot;
        this.vehicle = vehicle;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
