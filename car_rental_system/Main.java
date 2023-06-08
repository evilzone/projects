package com.software_design.car_rental_system;

import com.software_design.car_rental_system.product.VehicleType;
import com.software_design.car_rental_system.product.Vehicle;
import com.software_design.car_rental_system.product.Car;
import com.software_design.car_rental_system.product.Bike;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<User> userList = addUsers();
        List<Vehicle> vehicleList = addVehicles();
        List<Store> storeList = addStores(vehicleList);


        VehicleRentalSystem vehicleRentalSystem = new VehicleRentalSystem(userList, storeList);

        // user comes
        User user = userList.get(0);

        // user search store based on location
        Location location = new Location("addr1", "pune", "maha", 1234);

        // get the store closed to the location
        Store store = vehicleRentalSystem.getStore(location);

        // get the vehicles
        List<Vehicle> storeVehicles = store.getVehicles(VehicleType.CAR);

        // create the reservation with vehicle and user
        Reservation reservation = store.createReservation(storeVehicles.get(0), user);

        // generate bill against the reservation
        Bill bill = new Bill(reservation);

        // pay the bill
        Payment payment = new Payment();
        payment.payBill(bill);

        // complete the reservation
        store.completeReservation(reservation.reservationId);
    }

    public static List<Store> addStores(List<Vehicle> vehicleList) {
        List<Store> storeList = new ArrayList<>();

        Store store = new Store();
        store.setStoreId(1);
        store.setVehicles(vehicleList);

        storeList.add(store);
        return storeList;
    }


    public static List<Vehicle> addVehicles() {
        List<Vehicle> vehicleList = new ArrayList<>();
        Vehicle vehicle1 = new Car();
        vehicle1.setVehicleId(1);
        vehicle1.setVehicleType(VehicleType.CAR);

        Vehicle vehicle2 = new Bike();
        vehicle2.setVehicleId(2);
        vehicle2.setVehicleType(VehicleType.BIKE);

        vehicleList.add(vehicle1);
        vehicleList.add(vehicle2);
        return vehicleList;
    }

    public static List<User> addUsers() {
        List<User> userList = new ArrayList<>();
        User user = new User();
        user.setUserId(1);

        userList.add(user);
        return userList;
    }


}
