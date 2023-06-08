package com.software_design.car_rental_system;

import com.software_design.car_rental_system.product.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class VehicleInventoryManagement {
    List<Vehicle> vehicleList = new ArrayList<>();
    public VehicleInventoryManagement(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }

    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public void setVehicleList(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }
}
