package com.software_design.car_rental_system;

public class Bill {

    Reservation reservation;
    boolean isPaid;
    double amount;

    public Bill(Reservation reservation, boolean isPaid, double amount) {
        this.reservation = reservation;
        this.isPaid = isPaid;
        this.amount = amount;
    }

    public Bill(Reservation reservation) {
        this.reservation = reservation;
    }

    public double computeBill() {
        return 100.0;
    }
}
