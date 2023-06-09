package com.software_design.bookmyshow;

import com.bookmyshow.Seat;

import java.util.ArrayList;
import java.util.List;

public class Booking {

    Show show;
    List<Seat> seatList = new ArrayList<>();
    Payment payment;

    public Show getShow() {
        return show;
    }

    public List<Seat> getSeatList() {
        return seatList;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    public void setSeatList(List<Seat> seatList) {
        this.seatList = seatList;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
