package com.sushobhan.sapient.parkingLot;

public class Vehicle {
    private int vehicleNumber;
    private VehicleTypes vehicleTypes;

    public Vehicle(int vehicleNumber, VehicleTypes vehicleTypes) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleTypes = vehicleTypes;
    }

    public VehicleTypes getVehicleTypes() {
        return vehicleTypes;
    }
}
