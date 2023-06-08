package com.software_design.car_rental_system;

import com.software_design.car_rental_system.product.Vehicle;
import com.software_design.car_rental_system.product.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class Store {

    int storeId;
    VehicleInventoryManagement vehicleInventoryManagement;
    Location location;
    // CRUD
    List<Reservation> reservationList = new ArrayList<>();

    public void setVehicles(List<Vehicle> vehicleList) {
        vehicleInventoryManagement = new VehicleInventoryManagement(vehicleList);
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public List<Vehicle> getVehicles(VehicleType vehicleType) {
        return vehicleInventoryManagement.getVehicleList();
    }

    public Reservation createReservation(Vehicle vehicle, User user) {
        Reservation reservation = new Reservation();
        reservation.createReservation(vehicle, user);
        reservationList.add(reservation);
        return reservation;
    }

    public boolean completeReservation(int reservationId) {

        // take out reservation from the list and call complete the reservation method

        return true;
    }
}
