package com.software_design.car_rental_system;

public class Location {
    String address;
    String city;
    String state;
    int pincode;

    public Location(String address, String city, String state, int pincode) {
        this.address = address;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }
}
