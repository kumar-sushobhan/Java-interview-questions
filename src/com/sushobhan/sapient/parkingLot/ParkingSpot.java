package com.sushobhan.sapient.parkingLot;

public class ParkingSpot {
    private final int id;
    private Vehicle vehicle;
    boolean isEmpty;
    private final int price;

    public ParkingSpot(int price, int id) {
        this.price = price;
        this.id = id;
        this.isEmpty = true;
        this.vehicle = null;
    }

    public void parkVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
        this.isEmpty = false;
    }

    public void removeVehicle(Vehicle vehicle){
        this.vehicle = null;
        this.isEmpty = true;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
