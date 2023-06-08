package com.software_design.car_rental_system;

import com.software_design.car_rental_system.product.Vehicle;

import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

public class Reservation {
    int reservationId;
    User user;
    Vehicle vehicle;
    Date bookingDate;
    Date bookedFrom;
    Date bookedTill;
    Long fromTs;
    Long tillTs;
    Location pickupLocation;
    Location dropLocation;
    ReservationStatus reservationStatus;
    ReservationType reservationType;

    public int createReservation(Vehicle vehicle, User user) {
        reservationId = ThreadLocalRandom.current().nextInt(100000);
        setUser(user);
        setVehicle(vehicle);
        reservationType = ReservationType.DAILY;
        reservationStatus = ReservationStatus.SCHEDULED;

        return reservationId;
    }

    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }
}
