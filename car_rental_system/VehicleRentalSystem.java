package com.software_design.car_rental_system;

import java.util.ArrayList;
import java.util.List;

public class VehicleRentalSystem {

    List<User> userList = new ArrayList<>();
    List<Store> storeList = new ArrayList<>();

    // CRUD operation

    public VehicleRentalSystem(List<User> userList, List<Store> storeList) {
        this.storeList = storeList;
        this.userList = userList;
    }

    public Store getStore(Location location) {

        // get the nearest store to the location from the storelist
        return storeList.get(0);
    }

}
